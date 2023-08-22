import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int arr1[] = new int[n];

		long max = 0;

		for (int i = n - 1; i >= 0; i--) {
			arr1[i] = arr[i] * (n - i);
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}

		System.out.println(max);
	}

}