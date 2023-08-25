import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Solution {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         
        for(int j = 0; j < N; j++) {
            int[] arr = new int[10]; // 배열을 10으로 설정
         
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
         
            System.out.printf("#%d %d%n", j+1, arr[9]);
     
        }
    }
}