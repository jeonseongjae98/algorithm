import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[] visited;
	static Queue<Integer> queue;
	static int count = 0, answer = 1, total = 0, min = Integer.MAX_VALUE;
	static int[] check;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N + 1][N + 1];
		queue = new LinkedList<Integer>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			map[a][b] = 1;
			map[b][a] = 1;

		}

		for (int i = 1; i < N + 1; i++) {
			visited = new boolean[N + 1];
			check = new int[N + 1];
			total = 0;
			bfs(i);
			if (total < min) {
				min = total;
				answer = i;
			}
		}

		System.out.println(answer);

	}

	public static void bfs(int i) {

		count = 0;
		queue.offer(i); // add i
		visited[i] = true;

		while (!queue.isEmpty()) {
			int len = queue.size();
			count++;
			for (int l = 0; l < len; l++) {
				int nv = queue.poll();

				for (int j = 1; j < N + 1; j++) {
					if (map[nv][j] == 1 && !visited[j]) {
						queue.offer(j);
						visited[j] = true;
						total += count;
					}
				}
			}

		}

	}
}
