import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//부분 수열의 합
public class Solution {
	static int n, k, ans;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			ans = 0; // test case 마다 ans 초기화
			StringTokenizer st = new StringTokenizer(br.readLine());

			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[n];

			// 배열 요소 입력
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			// 재귀
			recursion(0, 0);

			// 출력
			System.out.printf("#%d %d\n", t, ans);
		}
	}

	private static void recursion(int idx, int sum) {
		if (idx == n) {
			if (sum == k) {
				ans++;
			}
			return;
		}

		recursion(idx + 1, sum + arr[idx]);
		recursion(idx + 1, sum);
	}

}