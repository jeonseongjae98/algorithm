import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			Stack<Character> st = new Stack<>();
			char arr[] = new char[s.length()];
			int sum = 0;

			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i);

			}
			for (int i = 0; i < s.length(); i++) {
				if (arr[i] == '(') {
					st.push(arr[i]);
				}

				else if (arr[i] == ')' && arr[i - 1] == '(') {
					st.pop();
					sum += st.size();
				} else if (arr[i] == ')' && arr[i - 1] == ')') {
					st.pop();
					sum += 1;
				}

			}

			System.out.printf("#%d %d%n", tc, sum);

		}
	}
}
