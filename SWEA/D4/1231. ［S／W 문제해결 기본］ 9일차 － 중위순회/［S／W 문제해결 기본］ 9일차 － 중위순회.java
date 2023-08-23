import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());

            String[] arr = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 버림
                arr[i] = st.nextToken();
            }

            System.out.print("#" + tc + " ");
            inorder(1, n, arr);
            System.out.println();
        }
    }

    public static void inorder(int i, int N, String[] arr) {
        if (i <= N) {
            inorder(i * 2, N, arr); // L
            if (arr[i] != " ") {
                System.out.print(arr[i]); // V
            }
            inorder(i * 2 + 1, N, arr); // R
        }
    }
}
