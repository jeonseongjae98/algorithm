class Solution {
    public boolean solution(String s) {
        // 길이가 4 또는 6인지 확인
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        // 모든 문자가 숫자인지 확인
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자가 숫자가 아닐 경우 false 반환
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        
        // 모든 조건을 만족하면 true 반환
        return true;
    }
}
