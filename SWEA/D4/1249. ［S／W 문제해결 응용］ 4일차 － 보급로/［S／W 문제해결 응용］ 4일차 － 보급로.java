import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//플로이드 와샬 알고리즘 = a->c로 가는 값보다 b를 거쳐 a->b + b->c 값이 더 작다면 작은 값을 택하는 알고리즘.
//바로 위의 로직은 하나의 노드를 거쳐 가지만(a->b->c),
//해당 로직이 반복되면 수많은 노드를 거쳐도 (a->b->c->d->e)
//시작노드와 도착노드만 남게 된다 (a->e)

public class Solution {
	static int n, ans;
	static int[][] map;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	static class Node implements Comparable<Node> {
		int x;
		int y;
		int cost;

		public Node(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}

	}

	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			n = Integer.parseInt(br.readLine());
			map = new int[n][n];

			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				for (int j = 0; j < n; j++) {
					map[i][j] = s.charAt(j) - '0';
				}
			} // 입력 받기

			dijkstra();
			System.out.println("#" + tc + " " + ans);

		}

	}

	public static void dijkstra() {
		boolean[][] visited = new boolean[n][n];
		int[][] length = new int[n][n];
		PriorityQueue<Node> p = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				length[i][j] = INF;
			}
		}

		length[0][0] = 0;

		p.add(new Node(0, 0, 0));
		while (!p.isEmpty()) {
			Node now = p.poll();
			if (visited[now.x][now.y])
				continue;

			visited[now.x][now.y] = true;
			for (int d = 0; d < 4; d++) {
				int nr = now.x + dr[d];
				int nc = now.y + dc[d];
				if (nr < 0 || nr >= n || nc < 0 || nc >= n)
					continue;
				length[nr][nc] =  Math.min(length[nr][nc], map[nr][nc]+length[now.x][now.y]);
				p.add(new Node(nr, nc, length[nr][nc]));
			}
			
		}
		ans = length[n-1][n-1];
	} // dijkstra()

}