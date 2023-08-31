import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc = 1; tc <= 10; tc++) {
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		System.out.println("#" + tc +" " + pow(C, N));
		}
	}

	public static int pow(int C, int N) {
		// 기저조건
		if (N == 1)
			return C;
		// 재귀조건
		// 짝수일때
		if (N % 2 == 0) {
			int tmp = pow(C, N / 2);
			return tmp * tmp;
		}
		// 홀수일때
		else {
			int tmp = pow(C, (N - 1) / 2);
			return tmp * tmp * C;
		}
	}

}
