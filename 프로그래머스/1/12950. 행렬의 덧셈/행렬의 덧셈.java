class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 두 배열의 크기가 같다고 가정
        int[][] answer = new int[arr1.length][arr1[0].length]; // arr1의 열 길이를 사용
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                // arr2도 arr1과 같은 크기라고 가정
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
