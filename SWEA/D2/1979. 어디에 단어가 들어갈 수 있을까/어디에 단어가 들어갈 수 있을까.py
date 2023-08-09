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
        	
        	
        	int[][] arr = new int[N+1][N+1];
        	
        	// 2차원 배열에 값 넣기
        	for(int i = 0; i < N; i++) {
        		st = new StringTokenizer(br.readLine());
        		for(int j = 0; j < N; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int cnt = 0;
        	
        	//가로 계산
        	for(int i = 0; i < N; i++) {
        		int sum = 0;
        		for(int j = 0; j < N; j++) {
        			if(arr[i][j] == 1) {
        				sum += 1;
        				if(arr[i][j+1] == 0) {
        					if(sum == M) {
                				cnt += 1;
                				
                			}
        					sum = 0;
        				}
        				
        			}
        			
        		}
        		
        	}
        	
        	
        	//세로 계산
        	for(int j = 0; j < N; j++) {
        		int sum = 0;
        		for(int i = 0; i < N; i++) {
        			if(arr[i][j] == 1) {
        				sum += 1;
        				
        				if(arr[i+1][j] == 0) {
        					if(sum == M) {
                				cnt += 1;
                			}
        					sum = 0;
        				}
        				
        				
        				
        			}
        			
        		}
        			
        			
        		
        	}
        	System.out.printf("#%d %d%n", tc, cnt);
        	
        	
        }
    	
    	
    	
    

        }
    }