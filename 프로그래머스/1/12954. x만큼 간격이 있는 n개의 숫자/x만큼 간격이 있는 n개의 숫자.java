import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> l =  new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            l.add((long)x + ((long)x * i));
        }
        
        long[] answer = new long[l.size()];
        for (int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        
        return answer;
    }
}