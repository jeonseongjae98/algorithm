import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] alp = new char[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] mbti = new int[4];//RT CF JM AN
        for(int i = 0; i < choices.length; i++){
            if(survey[i].equals("NA")){
                mbti[3] -= (choices[i] - 4);
            }
            if(survey[i].equals("AN")){
                mbti[3] += (choices[i] - 4);
            }
            if(survey[i].equals("MJ")){
                mbti[2] -= (choices[i] - 4);
            }
            if(survey[i].equals("JM")){
                mbti[2] += (choices[i] - 4);
            }
            if(survey[i].equals("FC")){
                mbti[1] -= (choices[i] - 4);
            }
            if(survey[i].equals("CF")){
                mbti[1] += (choices[i] - 4);
            }
            if(survey[i].equals("TR")){
                mbti[0] -= (choices[i] - 4);
            }
            if(survey[i].equals("RT")){
                mbti[0] += (choices[i] - 4);
            }
        }
        for(int j = 0; j < 4; j++){
            if(mbti[j] < 0){
                answer += alp[j*2];
            }else if(mbti[j] > 0){
                answer += alp[j*2 + 1];
            }else{
                answer += alp[j*2];
            }
        }
        return answer;
    }
}