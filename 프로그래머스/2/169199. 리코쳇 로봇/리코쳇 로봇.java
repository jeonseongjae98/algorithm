import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = 0;
        
        String[][] map = new String[board.length][board[0].length()];
        boolean[][] visited = new boolean[board.length][board[0].length()];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int[] start = new int[2];
        
        for(int i = 0; i < board.length; i++){
            String[] s = board[i].split("");
            for(int j = 0; j < s.length; j++){
                map[i][j] = s[j];
                if(s[j].equals("R")){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        
        // BFS
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while(!que.isEmpty()){
            int[] q = que.poll();
            int y = q[0];
            int x = q[1];
            int cnt = q[2];
            
            for(int i = 0; i < 4; i++){
                int nx = x;
                int ny = y;
                while(true) {
                    if( ny < 0 || ny >= map.length || nx < 0 || nx >= map[0].length){
                        break;
                    }
                    if(map[ny][nx].equals("D")){
                        nx -= dx[i];
                        ny -= dy[i];
                        break;
                    }
                    
                    nx += dx[i];
                    ny += dy[i];
                    
                }
                // 보드를 넘어갈 경우, 방향에 따라 위치 재조정
                if ( ny < 0 || ny >= map.length || nx < 0 || nx >= map[0].length ) {
                     if (i == 0 ) {
                        nx = map[0].length - 1;
                    } else if (i == 1) {
                        nx = 0;
                    } else if (i == 2) {
                        ny = map.length - 1;
                    } else {
                        ny = 0;
                    }
                 }
                if (map[ny][nx].equals("G")) {
                    return cnt + 1;
                }
                
                if (!visited[ny][nx]) {
                    que.add(new int[]{ny, nx, cnt + 1});
                    visited[ny][nx] = true;
                }
            }
        }
            return -1;
        
    }
}