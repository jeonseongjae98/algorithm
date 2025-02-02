import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        String[] a = new String[answer.size()];
        
        
        for(int i = 0; i < answer.size(); i++){
            a[i] = answer.get(i);
        }
        
        return a;
    }
}