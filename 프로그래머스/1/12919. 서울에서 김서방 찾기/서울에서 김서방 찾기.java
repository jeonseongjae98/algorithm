class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {  // 문자열 비교 수정
                answer = "김서방은 " + i + "에 있다";  // 인덱스를 문자열로 변환할 필요 없음
                break;
            }
        }
        return answer;
    }
}