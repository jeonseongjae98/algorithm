class Solution {
    public int solution(long num) {
        int answer = 0;

        // num이 1이 될 때까지 반복, cnt가 500을 초과하면 종료
        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2; // 짝수인 경우
            } else {
                num = num * 3 + 1; // 홀수인 경우
            }
            answer++;
            
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
