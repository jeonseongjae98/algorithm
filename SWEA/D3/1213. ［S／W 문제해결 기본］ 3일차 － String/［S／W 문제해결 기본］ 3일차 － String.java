import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int tc = 1 ; tc <= 10; tc++) {
			int t = Integer.parseInt(br.readLine());
			String s = br.readLine();
			String str = br.readLine();
			
			int re = 0;
			for(int i = 0; i <= str.length() - s.length(); i++) {
				int cnt = 0;
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == str.charAt(i + j)) {
						cnt += 1;
					}
					
					
				}
				if(cnt == s.length()) {
					re+=1;
				}

				
			}
			System.out.printf("#%d %d%n", tc, re);
		}
		
		
		
		
	}
	
}
