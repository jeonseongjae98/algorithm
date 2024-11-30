class Solution {
    public String solution(int num) {
        if (num % 2 == 1 || num % 2 == -1) { // 음수 홀수 처리
            return "Odd";
        } else {
            return "Even"; // num이 0일 경우와 짝수일 경우 모두 처리
        }
    }
}
