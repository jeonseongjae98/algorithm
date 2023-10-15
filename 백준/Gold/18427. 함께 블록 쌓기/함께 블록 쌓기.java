import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static final int MOD = 10_007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int[][] board = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			if (st.hasMoreTokens()) {
				int j = 0;
				while (st.hasMoreTokens()) {
					board[i][j++] = Integer.parseInt(st.nextToken());
				}
			}
		}

		int[][] dp = new int[N + 1][H + 1];
		for (int i = 0; i <= N; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= H; j++) {
				dp[i][j] = dp[i - 1][j]; // i의 블록을 사용하지 않음
				for (int k = 1; k <= M; k++) { // i의 k번째 블록을 사용
					int block = board[i - 1][k - 1];
					if (block == 0)
						continue;
					if (j - block >= 0) {
						dp[i][j] += dp[i - 1][j - block];
						dp[i][j] %= MOD;
					}
				}
			}
		}

		System.out.println(dp[N][H]);

	}
}