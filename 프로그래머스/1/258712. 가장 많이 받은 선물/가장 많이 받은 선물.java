import java.util.Arrays;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        int[] receiveCount = new int[friends.length];

        for (int i = 0; i < friends.length-1; i++) {
            for (int j = i+1; j < friends.length; j++) {

                String friend1 = friends[i];
                String friend2 = friends[j];
                int friend1ToFriend2 = 0;
                int friend2ToFriend1 = 0;

                for (String gift : gifts) {
                    if( gift.equals(friend1 + " " + friend2)) friend1ToFriend2++;
                    else if ( gift.equals(friend2 + " " + friend1)) friend2ToFriend1++;
                }

                if( (friend1ToFriend2 + friend2ToFriend1 == 0) || (friend1ToFriend2 == friend2ToFriend1) ) {
                    int friend1GiftPoint = 0;
                    int friend2GiftPoint = 0;
                    for (String gift : gifts) {
                        if(gift.split(" ")[0].equals(friend1)) friend1GiftPoint++;
                        else if (gift.split(" ")[0].equals(friend2)) friend2GiftPoint++;

                        if(gift.split(" ")[1].equals(friend1)) friend1GiftPoint--;
                        else if (gift.split(" ")[1].equals(friend2)) friend2GiftPoint--;
                    }

                    if(friend1GiftPoint > friend2GiftPoint) receiveCount[i]+= 1;
                    else if ( friend2GiftPoint > friend1GiftPoint) receiveCount[j]+= 1;
                } else {
                    if(friend1ToFriend2 > friend2ToFriend1) receiveCount[i]+= 1;
                    else receiveCount[j] += 1;
                }
            }
        }

        Arrays.sort(receiveCount);

        return receiveCount[receiveCount.length-1];
    }
}