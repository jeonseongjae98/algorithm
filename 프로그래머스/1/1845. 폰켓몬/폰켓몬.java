import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        int n = hs.size();
        if(n < nums.length/2){
            answer = n;
        }
        else{
            answer = nums.length/2;
        }
        
        return answer;
    }
}