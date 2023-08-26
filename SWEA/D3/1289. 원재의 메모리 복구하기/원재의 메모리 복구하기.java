import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			String s = br.readLine();
			char arr[] = new char[s.length()];

			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i);
			} // 배열에 넣기
			int ans = 0;
			char N= '0';
			
			for (int i = 0; i < s.length(); i++) {
				if (arr[i] != N) {
					ans++;
					N = arr[i];
				}

			}

			System.out.println("#" + tc + " " + ans);
		}
	}
}
