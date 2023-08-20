import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 1;
		int count = 1;
		
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			max = Math.max(max, count);
		} // 증가할 때

		int count1 = 1;
		
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				count1++;
			} else {
				count1 = 1;
			}
			max = Math.max(max, count1);
		}
		// 감소할 때
		System.out.println(max);
	}
}
