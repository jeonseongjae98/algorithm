import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());

			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			
			System.out.print("#" + tc + " ");
			for (int i = 1; i < n + 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				if (a == 1) {
					pq.add(Integer.parseInt(st.nextToken()));

				}

				else {
					if (!pq.isEmpty())
						System.out.print(pq.poll() + " ");
					else {
						System.out.print(-1 + " ");
					}
				}

			}
			System.out.println();
		}

	}

}