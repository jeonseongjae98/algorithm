import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int n1 = Integer.parseInt(st.nextToken());
		int[][] arr = new int[2][7];
		int a = 0;
		int b = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			arr[a][b]++;
		}
			for(int k = 0 ; k < 2 ; k ++) {
				for(int j = 1 ; j <7 ; j++) {
					count += arr[k][j] / n1 ;
					if(arr[k][j]% n1 !=0) {
						count++;
					}
				}
			}
			System.out.print(count);
		}
	}
