class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder(); // StringBuilder 사용

        // "수박"을 n/2 번 반복
        for (int i = 0; i < n / 2; i++) {
            answer.append("수박");
        }

        // n이 홀수인 경우 "수" 추가
        if (n % 2 == 1) {
            answer.append("수");
        }

        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}
