class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            String st = arr[i];
            
            if(arr[i].length() == 0){
                answer += " ";
            }
            else{
                answer += st.substring(0,1).toUpperCase();
                answer += st.substring(1,st.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        
        return answer.substring(0, answer.length()-1);
        
    }
}