import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			Stack<Character> st = new Stack();

			int re = 0;

			for (int i = 0; i < n; i++) {
				char c = s.charAt(i);
				if (c == ')' && st.peek() == '(') {
					st.pop();
				} else if (c == ']' && st.peek() == '[') {
					st.pop();
				} else if (c == '}' && st.peek() == '{') {
					st.pop();
				} else if (c == '>' && st.peek() == '<') {
					st.pop();
				} else {
					st.push(c);
				}

			}
			if (st.empty()) {
				re = 1;
			} else {
				re = 0;
			}

			System.out.printf("#%d %d%n", tc, re);

		}
	}
}
