
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int n, m, ans;
	static int[] p;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int[][] edges = new int[m][2];
			for (int i = 0; i < m; i++) {

				st = new StringTokenizer(br.readLine());
				edges[i][0] = Integer.parseInt(st.nextToken());
				edges[i][1] = Integer.parseInt(st.nextToken());
			}

			p = new int[n + 1];
			ans = 1;

			// makeset
			for (int i = 1; i <= n; i++) {
				p[i] = i;
			}

			for (int i = 0; i < m; i++) {
				int x = edges[i][0];
				int y = edges[i][1];

				if (findset(x) != findset(y))
					union(x, y);
			}

			for (int i = 1; i <= n; i++) { 
				findset(i);
			}

			Arrays.sort(p);
			for (int i = 1; i < p.length - 1; i++) {
				if (p[i] != p[i + 1])
					ans++;
			}

			System.out.printf("#%d %d\n", tc, ans);
		}

	}

	static int findset(int x) {
		if (x != p[x]) {
			p[x] = findset(p[x]);

		}
		return p[x];

	}

	static void union(int x, int y) {
		p[findset(y)] = findset(x);
	}
}