import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> suffixList = new ArrayList<>();
    
        for(int i=0; i<my_string.length(); i++)
        {
            String temp = my_string.substring(i);
            
            suffixList.add(temp);
        }
        
        if(suffixList.contains(is_suffix))
        {
            answer = 1;
        }
        else
        {
            answer = 0;
        }
          
        return answer;
    }
}