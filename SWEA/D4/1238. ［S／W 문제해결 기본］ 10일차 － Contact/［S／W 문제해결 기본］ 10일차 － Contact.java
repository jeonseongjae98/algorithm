
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int[][] node;
	static boolean[] visited;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = 10;
		for (int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());

			visited = new boolean[101];
			node = new int[101][101];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n / 2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				node[from][to] = 1;
			}

			System.out.println("#" + tc + " " + bfs(start));
		}
	}

	private static int bfs(int start) {
		Queue<Integer> q = new LinkedList<>(); // from -> to 갈 때마다 값 넣어줄 자료

		q.add(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			max = -1; // 제일 먼 거리에 대한 max값 초기화
			int r = q.size();
			for (int i = 0; i < r; i++) { // 거리가 같은 애들만 한번에 처리
				int now = q.poll();
				if (max < now)
					max = now;
				for (int j = 0; j < node[now].length; j++) { // from -> to의 개수만큼
					if (node[now][j] == 1 && !visited[j]) {
						q.add(j);
						visited[j] = true;
						max = Math.max(node[now][j], max);
					}

				}
			}
		}
		return max;

	}
}