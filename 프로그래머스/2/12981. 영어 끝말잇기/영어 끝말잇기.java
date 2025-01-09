import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> l = new ArrayList<>();
        boolean flag = true;
        
        l.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(l.contains(words[i])){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                flag = false;
                break;
            }
            l.add(words[i]);
             if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
        }
            }
        
        if(!flag){
            return answer;
        }
        return new int[] {0, 0};
        }
        
    }
