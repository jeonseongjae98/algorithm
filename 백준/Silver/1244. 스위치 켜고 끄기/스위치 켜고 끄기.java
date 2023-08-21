import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int n1 = Integer.parseInt(br.readLine());

		for (int j = 0; j < n1; j++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 남자 일 때
			if (a == 1) {
				for (int i = b - 1; i < n; i += b) {
					if (arr[i] == 0) {
						arr[i] = 1;
					} else {
						arr[i] = 0;

					}

				}
			}
			// 여자일 때
			else {
				int cnt = 0;
				if (arr[b - 1] == 0) {
					arr[b - 1] = 1;

				} else {
					arr[b - 1] = 0;
				}
				
				for (int i = 1; i < n / 2; i++) {
					if (b - i - 1 >= 0 && b + i - 1 < n) {
						if (arr[b - i - 1] == arr[b + i - 1]) {
							cnt++;
						} else {
							break;
						}
					}

				}
				
					
				

				for (int i = 1; i <= cnt; i++) {
					if (b - i - 1 >= 0 && b + i - 1 < n) {
						if (arr[b + i - 1] == 0) {
							arr[b + i - 1] = 1;
							arr[b - i - 1] = 1;
						} else {
							arr[b + i - 1] = 0;
							arr[b - i - 1] = 0;
						}
					}

				}

			}

		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if((i+1) % 20 == 0 && i != 0) {
				System.out.println();
			}
			
		}
		
	}

}