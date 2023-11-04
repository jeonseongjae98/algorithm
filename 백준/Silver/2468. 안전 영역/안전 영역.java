import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
	static int n;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		int max = 0; // 지형의 최고 높이

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > max)
					max = map[i][j];
			}
		} // input

		int res = 0;
		for (int h = 0; h <= max; h++) {
			visited = new boolean[n][n];
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] > h && !visited[i][j]) {
		
						cnt += dfs(i, j, h);
					}
				}
			}
			res = Math.max(cnt, res);
		}

		System.out.println(res);

	}

	static int dfs(int x, int y, int height) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// 물에 잠겨 있거나 이미 확인한 곳이면,
			if (nx < 0 || ny < 0 || nx >= n || ny >= n || map[nx][ny] <= height || visited[nx][ny])
				continue;

			dfs(nx, ny, height);

		}
		
		return 1;
	}

}