class Solution {
    public String solution(String new_id) {
        // 1단계: 모든 대문자는 소문자로
        String answer = new_id.toLowerCase();
        
        // 2단계: 알파벳, 숫자, -, _, .을 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계: 마침표(.)가 2번 이상 연속된 부분은 1개로 치환
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        
        // 4단계: 마침표(.)가 처음이나 끝에 있을 경우 제거
        if (answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 5단계: 빈 문자열이라면, a를 대입
        if (answer.length() == 0) answer = "a";
        
        // 6단계: 길이가 16 이상이면 처음 15개 문자를 제외하고 제거
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        
        // 7단계: 길이가 2 이하이면 길이가 3이 될 때까지 마지막문자 반복
        if (answer.length() == 1) {
            answer += String.valueOf(answer.charAt(0)) + String.valueOf(answer.charAt(0));
        } else if (answer.length() == 2) {
            answer += String.valueOf(answer.charAt(1));
        }
        
        return answer;
    }
}