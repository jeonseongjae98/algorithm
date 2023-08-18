import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n+m+1];
            
            for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= m; j++) {
					arr[i + j]++;
				}
			} // 더한값을 배열에 넣기
            
            
            int max = 0;
            for(int i = 2; i <= n+m; i++) {
            	max = Math.max(max, arr[i]);
            }
            
            System.out.print("#" + tc + " ");
            for(int i = 2; i <= m+n; i++) {
				if(max == arr[i])
					System.out.print(i + " ");
			}
            
            System.out.println();
        }
 
    }
 
}