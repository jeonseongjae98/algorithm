import java.util.*;
class Solution {
    private boolean[][] visited;
    private int[] dy = new int[]{1,-1,0,0};
    private int[] dx = new int[]{0,0,1,-1};
    private int[] fuel;
    private int answer = 0;
    public void bfs(int y,int x,int[][] land){
        ArrayDeque<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{y,x});
        boolean[] visitedY = new boolean[land[0].length];
        visited[y][x]=true;
        visitedY[x]=true;
        int maxY = land.length;
        int maxX = land[0].length;
        int total = 1;
        while(!que.isEmpty()){
            int[] cur = que.poll();
            for(int i = 0; i < 4; i++){
                int ty = cur[0]+dy[i];
                int tx = cur[1]+dx[i];

                //OOM
                if(0 > ty || ty >= maxY || 0 > tx || tx >= maxX){
                    continue;
                }

                //땅이거나 이미 탐색했한 경우
                if(land[ty][tx]==0 || visited[ty][tx]){
                    continue;
                }

                visited[ty][tx]=true;
                if(!visitedY[tx]){
                    visitedY[tx]=true;
                }
                que.offer(new int[]{ty,tx});
                total += 1;
            }
        }
        for(int i = 0,iEnd=land[0].length; i < iEnd; i++){
            if(visitedY[i]){
                fuel[i]+=total;
                if(answer < fuel[i]){
                    answer = fuel[i];
                }
            }
        }
    }
    public int solution(int[][] land) {
        visited = new boolean[land.length][land[0].length];
        fuel = new int [land[0].length];

        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                if(land[i][j]==1 && !visited[i][j]){
                    bfs(i,j,land);
                }
            }
        }
        return answer;
    }
}
