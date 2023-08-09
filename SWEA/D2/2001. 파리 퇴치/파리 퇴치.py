import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int tc = 1; tc <= t; tc++) {

        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.parseInt(st.nextToken());
        	int M = Integer.parseInt(st.nextToken());
        	
        	
        	int[][] arr = new int[N][N];
        	
        	int re = 0;
        	
        	
        	// 2차원 배열에 값 넣기
        	for(int i = 0; i < N; i++) {
        		st = new StringTokenizer(br.readLine());
        		for(int j = 0; j < N; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	
        	// 모든 경우의 수 구하기
        	for(int i = 0; i < N-M+1; i++) {
        		for(int j = 0; j < N-M+1; j++) {
        			int sum = 0;
        			for(int k = i; k < i + M; k++) {
                		for(int l = j; l < j + M; l++) {
                			
                			sum += arr[k][l];
                		}
                	}
        			re = Math.max(sum, re);
        			
        		}
        	}
        		
        	
        	System.out.printf("#%d %d%n", tc, re);
        	
        	}
        	
        	
        	
        	
        	
        	
        }
    	
    	
    	
    

        }
    