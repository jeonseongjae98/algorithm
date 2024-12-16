import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> ar = new ArrayList<>();
        String[] st = s.split(" ");
        
        for(int i = 0; i < st.length; i++){
            ar.add(Integer.parseInt(st[i]));
        }
        
        answer = Collections.min(ar)+ " " + Collections.max(ar);
        
        return answer;
    }
}