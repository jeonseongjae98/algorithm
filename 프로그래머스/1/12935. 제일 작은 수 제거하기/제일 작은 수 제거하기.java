import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) { // 빈 배열인 경우 answer에 -1 담기
            answer = new int[] {-1};
        } else {
            List<Integer> list = new ArrayList<>();
            for (int a : arr) { // arr 배열의 모든 요소를 a에 저장
                list.add(a);
            }
            
            list.remove(Collections.min(list)); // list의 가장 작은 수 제거
            answer = new int[arr.length - 1];
        
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i); // list를 answer에 저장
            }
        }
        return answer;
    }
}