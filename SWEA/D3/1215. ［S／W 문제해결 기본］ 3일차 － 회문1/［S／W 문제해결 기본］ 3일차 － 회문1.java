import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int[][] arr = new int[8][8];
            int result = 0;
            int num = Integer.parseInt(br.readLine());

            // 배열에 넣기
            for (int i = 0; i < 8; i++) {
            	String s = br.readLine();
                for (int j = 0; j < 8; j++) {      
                    arr[i][j] = s.charAt(j); // 문자를 정수로 변환하여 저장
                }
            }

          //가로
            for(int i =0; i<8;i++) {
                for(int j=0; j<8-num+1;j++) {
                    Boolean tmp = true;
                    for(int k=0;k<num/2;k++ ) {
                        if(arr[i][j+k]!=arr[i][j+num-k-1]) {
                        	tmp = false;
                        }
                    }
                    if(tmp) {
                        result++;
                    }
                    
                }
            }
            
            //세로
            for(int i =0; i<8-num+1;i++) {
                for(int j=0; j<8;j++) {
                	Boolean temp = true;
                    for(int k=0;k<num/2;k++ ) {
                        if(arr[i+k][j]!=arr[i+num-k-1][j]) {
                            temp = false;
                        }
                    }
                    if(temp) {
                        result++;
                    }
                    
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
