import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 0) return new int[0]; // 빈 배열 처리

        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                list.add(arr[i]);
            }
        }

        // ArrayList를 int 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // list에서 값을 가져옴
        }
        return answer;
    }
}
