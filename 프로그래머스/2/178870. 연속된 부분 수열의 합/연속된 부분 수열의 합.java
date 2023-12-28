import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        
        int l = 0;
        int r = 0;
        int sum = 0;
        int size = sequence.length;
        int ans1 = 0;
        int ans2 = 0;
        
        
        for(r = 0; r < sequence.length; r++){
            sum += sequence[r];
            
            if(sum > k){
                while(sum>k){
                sum -= sequence[l];
                    l++;
        }
            }
                if(sum == k){
                    if(size > r-l){
                        size = r-l;
                        ans1 = l;
                        ans2 = r;
                        
                    }
                    
                    else if(size == r - l){
                        ans1 = Math.min(ans1, l);
                        ans2 = Math.min(ans2, r);
                    }
                }
            }
        answer = new int[]{ans1, ans2};
        return answer;
    }
}