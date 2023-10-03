import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
        
		if (N >= 3)
			dp[3] = 1;
		if (N >= 5)
			dp[5] = 1;
		
        for (int i = 6; i <= N; i++) {
			if (i % 5 == 0) {
				dp[i] = dp[i - 5] + 1;
			} else if (i % 3 == 0) {
				dp[i] = dp[i - 3] + 1;
			} else {
				if (dp[i - 3] != 0 && dp[i - 5] != 0) {
					dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
				}
			}
		}
		
        if (dp[N] == 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(dp[N]);
	}
}