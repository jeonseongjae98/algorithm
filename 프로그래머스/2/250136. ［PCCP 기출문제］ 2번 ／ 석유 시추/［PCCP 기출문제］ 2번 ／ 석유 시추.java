import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int[] answer;

    public int solution(int[][] land) {
        answer = new int[land[0].length]; // 각 열별로 누적할 석유 양
        visited = new boolean[land.length][land[0].length];

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (!visited[i][j] && land[i][j] == 1) {
                    bfs(i, j, land);
                }
            }
        }

        int max = 0;
        for (int a : answer) {
            max = Math.max(a, max);
        }

        return max;
    }

    public static void bfs(int x, int y, int[][] land) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        // 석유가 있는 열을 담을 리스트
        Set<Integer> cols = new HashSet<>();
        cols.add(y);
        int cnt = 1; // 석유 수

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && nx < land.length && ny >= 0 && ny < land[0].length) {
                    if (!visited[nx][ny] && land[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});

                        cols.add(ny); // 열 위치 저장
                        cnt++;
                    }
                }
            }
        }

        for (int col : cols) {
            answer[col] += cnt;
        }
    }
}