import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n : priorities){
            pq.add(n);
        }
        while(!pq.isEmpty()) {
            for(int i = 0; i<priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    pq.poll();
                    answer++;
                    if(location == i){
                        return answer;
                    }
                    
                }
            }
        }
        
        return answer;
    }
}