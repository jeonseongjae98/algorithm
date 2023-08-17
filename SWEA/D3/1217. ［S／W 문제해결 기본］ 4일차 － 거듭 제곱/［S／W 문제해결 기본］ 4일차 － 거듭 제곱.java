import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");

			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			System.out.printf("#%d %d%n", n, pow(a, b));
		}
	}

	static int pow(int n, int m) {
		if (m <= 0) {
			return 1;
		} else {
			return n * pow(n, m - 1);
		}
	}
}
