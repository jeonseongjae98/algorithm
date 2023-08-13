import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			int arr[][] = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				String b = br.readLine();
				for(int j = 0; j < n; j++) {
					arr[i][j] = b.charAt(j);
						
					
				}
			}
			
			
			int dc[] = {-1, 1, 0, 0, -1, -1, 1, 1};
			int dr[] = {0, 0, -1, 1, -1, 1, 1, -1};
			
			String ans = "NO";
			
			
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					for(int d = 0; d < dc.length; d++) {
						if(arr[i][j] == 'o') {
							int cnt = 1;
							int c = j;
							int r = i;
							
							while(c+dc[d]>=0 && c+dc[d]<n && r+dr[d]>=0 && r+dr[d]<n && arr[r + dr[d]][c + dc[d]] == 'o') {
								cnt++;
								if(cnt >= 5) {
									ans = "YES";
									break;
								}
								c += dc[d];
								r += dr[d];
							}
							
						
						
					}
					
						
						
						
					}
					
						
					
				}
			}
			
			if(ans == "YES") {
				System.out.printf("#%d YES%n", tc);
			}
			else {
				System.out.printf("#%d NO%n", tc);
			}
			
			
		}
		
		
		
	}

}