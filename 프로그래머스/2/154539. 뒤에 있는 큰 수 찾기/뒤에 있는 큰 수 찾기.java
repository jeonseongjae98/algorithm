import java.util.*;
class Solution {  //스택을 사용해서 풀어야하는 문제
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0); //첫번째 인덱스 값
        for(int i=1; i<numbers.length; i++) {
            while(!stack.empty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i); //다음 인덱스 값을 넣어줌
        }
        
        // stack에 남은 인덱스 값들 = -1
        while(!stack.empty()) {
            answer[stack.pop()] = -1;
        }
        
        return answer;
    }
}