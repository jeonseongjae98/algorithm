import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			Queue<String> q1 = new LinkedList<>();
			Queue<String> q2 = new LinkedList<>();

			int n = Integer.parseInt(br.readLine());
			if (n % 2 == 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				for (int j = 0; j < n; j++) {
					if (j < n / 2) {
						q1.add(st.nextToken());
					} else {
						q2.add(st.nextToken());
					}
				} // 큐에 넣기
				System.out.print("#" + tc + " ");
				while (!q1.isEmpty() && !q2.isEmpty())
					for (int i = 0; i < n; i++) {
						if (i % 2 == 0) {
							System.out.print(q1.remove() + " ");
						} else if (i % 2 == 1) {
							System.out.print(q2.remove() + " ");
						}
					}

				System.out.println();

			}

			else {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j < n; j++) {
					if (j < n / 2 +1) {
						q1.add(st.nextToken());
					} else {
						q2.add(st.nextToken());
					}
				} // 큐에 넣기
				System.out.print("#" + tc + " ");
				while (!q1.isEmpty() && !q2.isEmpty())
					for (int i = 0; i < n; i++) {
						if (i % 2 == 0) {
							System.out.print(q1.remove() + " ");
						} else if (i % 2 == 1) {
							System.out.print(q2.remove() + " ");
						}
					}

				System.out.println();
				
			}

		}

	}

}