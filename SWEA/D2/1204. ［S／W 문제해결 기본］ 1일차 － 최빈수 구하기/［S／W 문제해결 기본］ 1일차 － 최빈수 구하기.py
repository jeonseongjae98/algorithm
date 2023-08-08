import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        
        
        for(int tc = 1; tc <= N; tc++) {
        	int a = Integer.parseInt(br.readLine());
        	int[] arr = new int[1000];
        	//  배열에 담기
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < 1000; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        	}
        	int[] score = new int[101];
        	
        	for(int i  = 0; i < arr.length; i++) {
        		score[arr[i]]++;
        	}
        	int max = 0;
        	int idx = 0;
        	for(int i  = 0; i < 101; i++) {
        		if(score[i] >= max) {
        			max = score[i];
        			idx = Math.max(i, idx);
        		
        				
        			
        		}
        	}
        
        System.out.printf("#%d %d%n", tc, idx);
    
        
        }
        

        }
    }