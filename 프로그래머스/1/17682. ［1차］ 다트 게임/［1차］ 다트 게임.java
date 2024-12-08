class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int index = -1; // 점수의 인덱스
        
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (Character.isDigit(ch)) {
                index++;
                // 점수 계산
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    score[index] = 10; // 10점일 경우
                    i++; // 다음 문자로 이동
                } else {
                    score[index] = Character.getNumericValue(ch); // 1~9점
                }
            } else {
                // 보너스 처리
                switch (ch) {
                    case 'D':
                        score[index] = (int) Math.pow(score[index], 2);
                        break;
                    case 'T':
                        score[index] = (int) Math.pow(score[index], 3);
                        break;
                    case '*':
                        score[index] *= 2;
                        if (index > 0) {
                            score[index - 1] *= 2; // 이전 점수도 두 배
                        }
                        break;
                    case '#':
                        score[index] *= -1; // 점수 반전
                        break;
                }
            }
        }
        
        // 최종 점수 합산
        for (int s : score) {
            answer += s;
        }
        
        return answer;
    }
}
