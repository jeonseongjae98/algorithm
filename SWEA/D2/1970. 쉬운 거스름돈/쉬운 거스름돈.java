import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] money= {1,5,10,50,100,500,1000,5000}; // 배열칸 8개, 10원 단위로
        for(int tc=1;tc<=t;tc++) {
            int n=sc.nextInt();
            int[][] dp=new int[n/10+1][9]; // 0~7: 동전 각각 개수 / 8: 총 개수
            //1칸당 10원
            for(int i=1;i<=n/10;i++) {
                //우선10원짜리 1개 무조건 채우기
                dp[i][8]=dp[i-1][8]+1;
                dp[i][0]=dp[i-1][0]+1;
                for(int j=1;j<8;j++) {
                    dp[i][j]=dp[i-1][j];
                }
                for(int j=1;j<8;j++) {
                    if(money[j]>i) break; // index 오류
                    if(dp[i-money[j]][8]+1<dp[i][8]) {
                        dp[i][8]=dp[i-money[j]][8]+1;
                        for(int k=0;k<8;k++) {
                            if(k==j) dp[i][k]=dp[i-money[j]][k]+1;
                            else dp[i][k]=dp[i-money[j]][k];
                        }
                    }
                }
            }
            System.out.println("#"+tc);
            for(int i=7;i>=0;i--) {
                System.out.print(dp[n/10][i]+" ");
            }
            System.out.println();
        }
    }
}