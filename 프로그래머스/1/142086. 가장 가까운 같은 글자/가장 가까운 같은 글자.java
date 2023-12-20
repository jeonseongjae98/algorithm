import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                list.add(i - map.get(s.charAt(i)));
                map.put(s.charAt(i), i);
            }
            else{
                map.put(s.charAt(i), i);
                 list.add(-1);
                }
            }      
        
        
        
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
    
        return answer;
    }
}