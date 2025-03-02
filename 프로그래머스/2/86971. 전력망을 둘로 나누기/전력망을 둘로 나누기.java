import java.util.*;

class Solution {
    static int[][] arr;  // 인접 행렬을 위한 정적 변수 추가

    public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n + 1][n + 1];  // 인접 행렬 초기화
        
        for (int i = 0; i < wires.length; i++) {
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        int a, b;
        for (int i = 0; i < wires.length; i++) {
            a = wires[i][0];
            b = wires[i][1];
            
            // 선을 하나 끊음
            arr[a][b] = 0;
            arr[b][a] = 0;
        
            // BFS 호출
            answer = Math.min(answer, bfs(n, a));
            
            // 선 다시 복구
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        return answer;
    }
    
    public int bfs(int n, int start) {
        int[] visit = new int[n + 1];
        int cnt = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        
        while (!queue.isEmpty()) {
            int point = queue.poll();
            visit[point] = 1;
            
            for (int i = 1; i <= n; i++) {  // 1부터 n까지 반복
                if (visit[i] == 1) continue;  // 이미 방문한 정점은 건너뜀
                if (arr[point][i] == 1) {
                    queue.offer(i);
                    cnt++;
                }
            }
        }
        
        return (int)Math.abs(cnt - (n - cnt));  // 두 부분 그래프의 차이 계산
    }
}
