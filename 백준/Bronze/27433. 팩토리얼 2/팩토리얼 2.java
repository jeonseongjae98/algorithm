import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long sum = 1;

		for (int tc = t; tc >= 1; tc--) {
			sum *= tc;

			
		}
		System.out.println(sum);
	}
}
