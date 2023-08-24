import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= t; tc++) {
			int re = 1;
			int arr[][] = new int[9][9];
			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					
				}
				
			}//배열에 입력 받기
			
			// 가로 확인
			for (int i = 0; i < 9; i++) {
				int num[] = new int[10];
				for (int j = 0; j < 9; j++) {
					num[arr[i][j]]++;
				}
				for(int j = 1; j <= 9; j++) {
					if(num[j] != 1) {
						re = 0;
						break;
					}
				}
				
			}
			
			// 세로 확인
			for (int i = 0; i < 9; i++) {
				int num[] = new int[10];
				for (int j = 0; j < 9; j++) {
					num[arr[j][i]]++;
				}
				for(int j = 1; j <= 9; j++) {
					if(num[j] != 1) {
						re = 0;
						break;
					}
				}
				
			}
			
			// 3x3 확인
			for (int i = 0; i < 9; i+=3) {
				for (int j = 0; j < 9; j+=3) {
					int num[] = new int[10];
					for(int k = 0; k < 3; k++) {
						for(int l = 0; l < 3; l++) {
							num[arr[i+k][j+l]]++;
						}
					}
					for(int u = 1; u <= 9; u++) {
						if(num[u] != 1) {
							re = 0;
							break;
						}
					}
				}
				
			}
			
			
			System.out.println("#"+tc +" " + re);
		}
	}

}
