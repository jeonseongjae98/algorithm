class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i; // 첫 번째 음수가 나온 인덱스 반환
            }
        }
        return -1; // 배열에 음수가 없는 경우 -1 반환
    }
}
