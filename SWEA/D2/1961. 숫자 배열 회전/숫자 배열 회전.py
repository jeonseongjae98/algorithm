import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());

			int arr[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			} // 배열에 넣기

				int [][] turn90 = new int[n][n];
				for (int a = 0; a < n; a++) {
					for (int b = 0; b < n; b++) {

						turn90[a][b] = arr[n - b -1][a];					
					}
					

				}// 90도
				int [][] turn180 = new int[n][n];
				for (int a = 0; a < n; a++) {
					for (int b = 0; b < n; b++) {
						turn180[a][b] = arr[n - a - 1][n - b -1];
					}
				}// 180도
				
				int [][] turn270 = new int[n][n];
				for (int a = 0; a < n; a++) {
					for (int b = 0; b < n; b++) {
						turn270[a][b] = arr[b][n - a -1];
					}
				}// 270도
				
				System.out.println("#"+tc);
				for (int i = 0; i< n; i++) {
	                for (int j = 0; j<n; j++) {
	                    System.out.print(turn90[i][j]);
	                }
	                System.out.print(" ");
	                for (int j = 0; j<n; j++) {
	                    System.out.print(turn180[i][j]);
	                }
	                System.out.print(" ");
	                for (int j = 0; j<n; j++) {
	                    System.out.print(turn270[i][j]);
	                }
	                System.out.println();
	            }
				
			}
		}
	}


