import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        
        for(int k = 1; k <= N; k++) {
        	int sum = 0;
        	int[] arr = new int[10];
        	//  배열에 담기
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < 10; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        	}
        
        // 배열 정렬
        Arrays.sort(arr);
        
        // 최대,최소 빼고 더하기
        for(int i = 1; i < 9; i++) {
        	sum += arr[i];
        }
        
        System.out.printf("#%d %d%n", k, Math.round((double)sum/(arr.length-2)));
        
        }
        

        }
    }