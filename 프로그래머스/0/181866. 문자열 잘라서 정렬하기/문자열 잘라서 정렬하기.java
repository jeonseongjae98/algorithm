import java.util.*;
class Solution {
    public String[] solution(String myString) {
        
        String[] strArr = myString.split("x"); // 1.
       
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : strArr){ // 2.
            if(!str.isEmpty()){
                list.add(str);
            }
        }

        String[] result =  new String[list.size()]; // 3.
        list.toArray(result);
        Arrays.sort(result);
        
        
        return result;
    }
}