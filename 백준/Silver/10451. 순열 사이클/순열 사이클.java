import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visit;
	static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < t; tc++) {
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			arr = new int[n + 1];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 1; i < n + 1; i++) {
				arr[i] = Integer.parseInt(st.nextToken());

			}

			visit = new boolean[n + 1];
			for (int i = 1; i < n + 1; i++) {
				if (!visit[i]) {
					dfs(i);
					count++;
				}
			}
			System.out.println(count);
		}
	}

	static void dfs(int start) {
		visit[start] = true;
		int next = arr[start];
		if (!visit[next]) {
			dfs(arr[start]);
		}

	}

}
