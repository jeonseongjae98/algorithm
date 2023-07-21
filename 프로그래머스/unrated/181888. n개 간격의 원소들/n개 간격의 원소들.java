class Solution {
    public int[] solution(int[] num_list, int n) {
    
        int[] answer;
        
        // 배열의 길이가 짝수/홀수에 따라 새로운 길이의 배열을 생성
        if (num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[(num_list.length / n) + 1];
        }
        
        int index = 0;
        
        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}