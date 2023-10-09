import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int n, m;
	public static int[] arr;
	public static int[] nums;
	public static StringBuilder sb = new StringBuilder();
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		nums = new int[n+1];
		visit = new boolean[n + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);

		dfs(0);
		System.out.println(sb);
	}

	public static void dfs(int cnt) {
		if (cnt == m) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		int before = 0;
		for (int i = 1; i <= n; i++) {
			if (visit[i])
				continue;

			if (before != nums[i]) {
				visit[i] = true;
				arr[cnt] = nums[i];
				before = nums[i];
				dfs(cnt + 1);
				visit[i] = false;
			}
		}
	}
}