class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int arr[] = new int[n];
        for (int i = 0; i < section.length; i++) {
            
                arr[section[i]-1] = 1;
            
        } // 표시
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                answer++;
                for (int j = 0; j < m && i + j < n; j++) { // 배열의 범위를 벗어나지 않도록 확인
                    arr[i + j] = 0;
                }        
            }
        }
        return answer;
    }
}