import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	Queue q = new LinkedList();
        
        // 0번째 트럭을 올릴거기 때문에 bridge_length - 1 만큼 0으로 채워줌
        for(int i=0;i<bridge_length-1;i++){
            q.add(0);
        }
        
        // 현재 다리에 있는 트럭 무게
        int current_w = truck_weights[0];
        // 0번째 트럭을 다리 위에 올리기
        q.add(current_w);
        
        int answer = 1; // 0번째 트럭이 이미 올라갔으므로 시간 1부터 시작
        int index = 1; // 0번째 트럭이 이미 올라갔으므로 다음 트럭 index는 1부터 시작
        
        while(!q.isEmpty()){
            answer++; // 시간 1 증가
            
            int removed = (int) q.poll(); // 빠져나갈 트럭 1대 제거
            current_w -= removed; // 현재 다리의 트럭무게에서 제거된 트럭 무게 제거

		// 남은 트럭이 존재할 경우 (올라가야할 트럭이 남아있을 경우)
            if(index < truck_weights.length){
            	// 현재 다리에 있는 트럭무게 + 다음에 올라갈 트럭 무게 <= 다리가 버틸 수 있는 무게
                if(current_w + truck_weights[index] <= weight){
                    current_w += truck_weights[index]; // 다음 트럭 무게 추가
                    q.add(truck_weights[index]); // queue 에 다음 트럭 추가
                    index++; // index 증가
                }else{
                    q.add(0); // 다음 트럭이 오지 못했으므로, 0 추가 (다음 트럭이 다음번에 와야하므로)
                }
            }
        }
        
        return answer;
    }
}