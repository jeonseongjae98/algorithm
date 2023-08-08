import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        
        for(int tc = 1; tc <= 10; tc++) {
        	int[] arr = new int[101];
            int N = Integer.parseInt(br.readLine());
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i = 1; i < 101; i++) {
                //  배열에 층수 담기
                    arr[i] = Integer.parseInt(st.nextToken());
                }
            
          	int maxidx = 0;
          	int minidx = 0;
          	for(int i = 0; i <= N; i++) {
          		int max = Integer.MIN_VALUE;
          		int min = Integer.MAX_VALUE;
          		arr[maxidx]--;
          		arr[minidx]++;
          		for(int j = 1; j < arr.length; j++) {
          			if(max <= arr[j]) {
          				max = arr[j];
          				maxidx = j;
          				
          			}
          			if(min > arr[j]) {
          				min = arr[j];
          				minidx = j;
          				
          			}
          		}
          		
          	}
          	
            System.out.println("#" + tc + " " + (arr[maxidx] - arr[minidx]));
            
            
                
                
            }
        

        }
    }