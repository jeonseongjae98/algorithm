import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashSet<Integer> h = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
           h.add(numbers[i]);
        }
        
        for(int i = 0; i < 10; i++){
            if(!h.contains(i)){
                answer+=i;
            }
        }
        
        return answer;
    }
}