import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());

		int arr[] = new int[n1 + 1];
		int cnt = 0;
		int ans = 0;

		for (int i = 2; i <= n1; i++) {
			if (arr[i] == 1) {
				continue;
			}

			for (int j = i; j <= n1; j += i) {
				if (arr[j] != 1) {
					arr[j] = 1;
					cnt++;
					if (cnt == n2) {
						ans = j;
						break;
					}
				} else {
					continue;
				}

			}

		}
		System.out.println(ans);
	}
}
