import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            char c = arr[i];
            if(st.isEmpty()){
                st.push(c);
            }
            else{
                if(st.peek()==c){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }

        return st.isEmpty() ? 1 : 0;
    }
}