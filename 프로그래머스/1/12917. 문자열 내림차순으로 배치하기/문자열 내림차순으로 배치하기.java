import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] arr = s.toCharArray();
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(arr);
        
        // 정렬된 배열을 반전하여 새 문자열 생성
        StringBuilder answer = new StringBuilder(new String(arr));
        answer.reverse(); // 내림차순으로 만들기 위해 문자열 반전
        
        return answer.toString();
    }
}
