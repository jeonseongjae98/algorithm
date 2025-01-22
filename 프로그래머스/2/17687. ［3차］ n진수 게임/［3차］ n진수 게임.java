class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "", temp = "";
        
		// 게임 전체에서 나오는 값을 저장
        for(int i = 0; temp.length() < t*m; i++) {
            temp += Integer.toString(i, n);
        }
        
		// 원하는 순번에 외쳐야하는 번호만 따로 저장
        for(int i = p-1; answer.length() < t; i += m) {
            answer += temp.charAt(i);
        }
        
		// 모두 대문자로 반환
        return answer.toUpperCase();
    }
}