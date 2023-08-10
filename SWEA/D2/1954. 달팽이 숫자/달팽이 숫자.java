import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
	
		for (int tc = 1; tc <= t; tc++) {
			int N = Integer.parseInt(br.readLine());
			int arr[][] = new int[N][N];
			int dc[] = { 0, 1, 0, -1 };
			int dr[] = { 1, 0, -1, 0 };	 //우,하,좌,상
			int count = 1;
			int c = 0, r = 0;
			int d = 0; 
			while (count <= N * N) {
				arr[c][r] = count++;
				int nc = c + dc[d];
				int nr = r + dr[d];
				if (nc < 0 || nc >= N || nr < 0 || nr >= N || arr[nc][nr] != 0) {  //경계 벗어나거나, 숫자가 이미 존재하면
					d = (d + 1) % 4;  //방향바꿈  
					nc = c + dc[d];
					nr = r + dr[d];
				}
				c = nc;
				r = nr;
			}
			System.out.printf("#%d\n",tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++)
					System.out.print(arr[i][j] + " ");
				System.out.println();
			}
		}
	}

}