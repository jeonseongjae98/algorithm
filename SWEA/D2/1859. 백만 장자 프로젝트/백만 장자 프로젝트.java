import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());

			long arr[] = new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			} // 배열에 넣기

			long max = arr[n - 1];
			long ans = 0;
			for (int i = n - 2; i >= 0; i--) {
				if (arr[i] > max) {
					max = arr[i];

				} else {
					ans += max - arr[i];
				}
			}

			System.out.println("#" + tc + " " + ans);
		}
	}
}
