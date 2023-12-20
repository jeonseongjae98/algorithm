class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < goal.length; i++){
            if(c1 < cards1.length && cards1[c1].equals(goal[i])){
                c1++;
            }
            else if(c2 < cards2.length && cards2[c2].equals(goal[i])){
                c2++;
            }
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}