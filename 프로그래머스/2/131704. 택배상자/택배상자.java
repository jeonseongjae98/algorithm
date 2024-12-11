import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int idx = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 1; i <= order.length; i++){
            s.push(i);
            while(!s.isEmpty()){
                if(s.peek() == order[idx]){
                    s.pop();
                    idx++;
                    answer++;
                }
                else{
                    break;
                }
            }
        }
        
        
        return answer;
    }
}