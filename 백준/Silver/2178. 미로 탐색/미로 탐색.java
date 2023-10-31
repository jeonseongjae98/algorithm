import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.MappedByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] map;
	static int n;
	static int m;
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 }; // 상하
	static int[] dc = { 0, 0, -1, 1 }; // 좌우

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		} // 입력값 받기

		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[n-1][m-1]);

	}

	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y });

		while (!q.isEmpty()) {
			int no[] = q.poll();
			int nox = no[0];
			int noy = no[1];
			for (int i = 0; i < 4; i++) {
				int nex = nox + dr[i]; // 다음으로 갈 x값
				int ney = noy + dc[i]; // 다음으로 갈 y값

				if (nex < 0 || ney < 0 || nex >= n || ney >= m || visited[nex][ney] || map[nex][ney] == 0)
					continue;

				q.add(new int[] { nex, ney });
				map[nex][ney] = map[nox][noy] + 1;
				visited[nex][ney] = true;
			}

		}
	}

}