
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	
		for(int tc = 1 ; tc <= N; tc++) {
			int re = 1;
			String s = br.readLine();
			for(int i = 0; i < s.length()/2; i++) {			
				if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
					re = 0;
					break;
				}
				
			}
			System.out.printf("#%d %d%n", tc, re);
		}
		
		
		
		
	}
	
}
