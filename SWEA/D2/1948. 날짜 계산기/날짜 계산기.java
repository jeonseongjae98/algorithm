import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 계산기 1
public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		for (int tc = 1; tc <= t; tc++) {
			int re = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m1 = Integer.parseInt(st.nextToken());
			int d1 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int d2 = Integer.parseInt(st.nextToken());
			
			for(int m = m1; m< m2; m++) {
                re += day[m];
            }
			re += (d2 - d1) + 1;
			
			System.out.println("#" + tc + " " + re);
			
		}
		
	}
}