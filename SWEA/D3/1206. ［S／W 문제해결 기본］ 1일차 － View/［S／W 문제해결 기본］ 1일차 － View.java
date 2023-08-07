import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 1; i <= 10; i++) {
			int sum = 0;
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
            
			for(int j = 0; j < N; j++) {
			//  배열에 층수 담기
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for(int k = 2; k < arr.length-2; k++) { 

					if(arr[k] > arr[k+1] && arr[k] > arr[k+2] && arr[k] > arr[k-1] && arr[k] > arr[k-2]) {
						int n1 = arr[k] - arr[k+1];
						int n2 = arr[k] - arr[k+2];
						int n3 = arr[k] - arr[k-1];
						int n4 = arr[k] - arr[k-2];
						int re = Math.min(n1, n2);
						int re1 = Math.min(n3, n4);
						int re2 = Math.min(re, re1);
						sum += re2;
					
				}
			}
			System.out.printf("#%d %d%n", i, sum);
		}
	}
}