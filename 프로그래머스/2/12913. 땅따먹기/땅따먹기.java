class Solution {
    int solution(int[][] land) {
        int answer = 0;

        // 1부터 land의 길이까지 반복
        for (int i = 1; i < land.length; i++) {
            // 현재 행에 이전 행에서 현재 열과 다른 값 중 가장 큰 값을 찾아 더함
            land[i][0] += maxNumber(land[i-1][1], land[i-1][2], land[i-1][3]);
            land[i][1] += maxNumber(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += maxNumber(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += maxNumber(land[i-1][0], land[i-1][1], land[i-1][2]);
        }

        // 마지막 행의 최댓값을 구하기
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length-1][i]);
        }

        return answer;
    }

    // a, b, c 중 가장 큰 값을 반환하는 메서드
    public int maxNumber(int a, int b, int c) {

        return Math.max(Math.max(a, b), c);
    }
}