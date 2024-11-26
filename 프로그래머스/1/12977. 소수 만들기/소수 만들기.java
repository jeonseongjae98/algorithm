class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int a,b,c;
        for(int i=0; i<nums.length; i++){
            a = nums[i];
            for(int j=i+1; j<nums.length; j++){
                b = nums[j];
                for(int k=j+1; k<nums.length; k++){
                    c = nums[k];
                    if(check(a+b+c)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public boolean check(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}