import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
	static int n, m;
	static int[][] map;
	static boolean[] visited = new boolean[1001];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[1001][1001];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = map[y][x] = 1;
		}
		int re = 0;

		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i);
				re++;
			}
		}

		System.out.println(re);

	}

	static void dfs(int index) {
		if (visited[index])
			return;
		else {
			visited[index] = true;
			for (int i = 1; i <= n; i++) {
				if (map[index][i] == 1) {
					dfs(i);
				}
			}
		}
	}

}