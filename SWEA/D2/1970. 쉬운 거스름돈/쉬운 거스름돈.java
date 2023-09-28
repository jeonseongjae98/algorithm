import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	// 반복문을 최대한 줄이려고 10으로 나누어주었다
	// 대충 동전이라고 하자
	static int[] money = { 1, 5, 10, 50, 100, 500, 1000, 5000 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine()) / 10; // 금액도 10으로 나눔
			int[][] dp = new int[N + 1][8];
			int[] sum = new int[N + 1];
			Arrays.fill(sum, Integer.MAX_VALUE); 
			sum[0] = 0; 


			for (int i = 1; i <= N; i++) { // N원 까지
				for (int j = 0; j < 8; j++) { // 동전에 대한 반복문
					if (i >= money[j] && sum[i] > sum[i - money[j]] + 1) {
						sum[i] = sum[i - money[j]] + 1;
						
						for (int k = 0; k < 8; k++) {
							if (k == j)
								dp[i][k] = dp[i - money[j]][k] + 1;
							else
								dp[i][k] = dp[i - money[j]][k];
						}
					}
				}
			}

			// 답 출력
			System.out.println("#" + tc);
			for (int i = 7; i >= 0; i--) {
				System.out.print(dp[N][i] + " ");
			}
			System.out.println();

		} 
	} 
} 