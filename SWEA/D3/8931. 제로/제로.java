import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc <= t; tc++) {
			
			int t1 = Integer.parseInt(br.readLine());
			
			int sum = 0;
			
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int i = 0; i < t1; i++) {
				int n = Integer.parseInt(br.readLine());
				
				if(n == 0) {
					sum -= stack.pop();
				}
				else {
					stack.push(n);
					sum += n;
				}
				
				
				
				
			} 
			
			
			
				
			System.out.printf("#%d %d%n", tc, sum);
		
		
		
		}
	
	}
}
