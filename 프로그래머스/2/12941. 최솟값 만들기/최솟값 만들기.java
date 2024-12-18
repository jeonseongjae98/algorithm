import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        // B 배열을 정렬하고, 내림차순으로 정렬하기 위해 직접 역순으로 정렬
        Arrays.sort(B);
        for (int i = 0; i < B.length / 2; i++) {
            // B의 첫 번째와 마지막 요소를 교환
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;
        }
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}
