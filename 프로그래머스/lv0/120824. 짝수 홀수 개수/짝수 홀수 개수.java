class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0}; // 크기가 2인 배열로 변경

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0)
                answer[0]++; // 짝수 개수 증가
            else
                answer[1]++; // 홀수 개수 증가
        }
        return answer;
    }
}
