import java.util.*;
class Solution {
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0}; // 상하좌우
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        
        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    public void bfs(int[][] maps, int[][] visited){

        visited[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        while(!queue.isEmpty()){
            int[] cur = queue.remove();
            int cx = cur[0];
            int cy = cur[1];
            
            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx<0 || nx>maps.length-1 || ny<0 || ny>maps[0].length-1){
                    continue;
                }
                
                 if(visited[nx][ny] == 0 && maps[nx][ny] == 1){
                    visited[nx][ny] = visited[cx][cy] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        
    }
    
    
}