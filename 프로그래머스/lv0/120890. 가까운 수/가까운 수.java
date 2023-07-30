import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min = Math.abs(array[0] - n);
        int answer = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > Math.abs(array[i] - n)){
                min = Math.abs(array[i] - n);
                answer = array[i];
                }
            }
        
        return answer;
    }
}
