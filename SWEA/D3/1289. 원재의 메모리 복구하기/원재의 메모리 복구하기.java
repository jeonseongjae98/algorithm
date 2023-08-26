import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			String s = br.readLine();
			int arr[] = new int[s.length()];

			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i) - '0';
			} // 배열에 넣기
			int ans = arr[0];
			for (int i = 1; i < s.length(); i++) {
				if (arr[i] != arr[i - 1]) {
					ans++;
				}

			}

			System.out.println("#" + tc + " " + ans);
		}
	}
}
