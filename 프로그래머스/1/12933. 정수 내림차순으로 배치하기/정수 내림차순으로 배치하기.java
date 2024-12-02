import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환
        String m = String.valueOf(n);
        // 문자열의 길이를 구함
        int s = m.length();
        long[] arr = new long[s];
        
        // 각 문자를 숫자로 변환하여 배열에 저장
        for (int i = 0; i < s; i++) {
            arr[i] = m.charAt(i) - '0';  // 문자에서 '0'을 빼서 정수로 변환
        }
        
        // 배열을 정렬 (오름차순)
        Arrays.sort(arr);
        
        // 정렬된 배열을 역순으로 변환하여 다시 숫자로 변환
        long answer = 0;
        for (int i = s - 1; i >= 0; i--) {
            answer = answer * 10 + arr[i];  // 각 숫자를 합쳐서 정수로 변환
        }
        
        return answer;
    }
}
