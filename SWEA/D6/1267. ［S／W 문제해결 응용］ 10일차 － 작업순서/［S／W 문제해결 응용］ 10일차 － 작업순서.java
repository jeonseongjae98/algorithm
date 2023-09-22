import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int[][] node;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 10; tc++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			node = new int[v + 1][v + 1];
			int[] degree = new int[v + 1]; // 진입차수를 저장할 배열을 하나 생성

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < e; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				node[from][to] = 1;
				degree[to]++;
			} // 입력 완료!

			Queue<Integer> q = new LinkedList<>();

			for (int i = 1; i < v + 1; i++) {
				if (degree[i] == 0)
					q.add(i);
			}
			System.out.print("#" + tc + " ");
			while (!q.isEmpty()) {
				int now = q.poll();
				System.out.print(now + " ");
				for (int i = 1; i < v + 1; i++) {
					if (node[now][i] == 1) {
						node[now][i] = 0;
						degree[i]--;
						if (degree[i] == 0) {
							q.add(i);
						}
					}

				}
			}
			
			System.out.println();

		}
	}

}
