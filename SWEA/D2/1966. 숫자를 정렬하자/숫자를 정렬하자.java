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
        	int[] arr = new int[a];
        	//  배열에 담기
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < a; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        	}
        
        	// 선택 정렬
        	for(int i = 0; i < a-1; i++){
        		int minidx = i;
        		for(int j = i+1; j <a; j++) {
        			if(arr[j] < arr[minidx]) {
        				minidx = j;
        			}
        		}
        		int tmp = arr[i];
        		arr[i] = arr[minidx];
        		arr[minidx] = tmp;
        	}

        
        System.out.printf("#%d", tc);
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        }
        

        }
    }