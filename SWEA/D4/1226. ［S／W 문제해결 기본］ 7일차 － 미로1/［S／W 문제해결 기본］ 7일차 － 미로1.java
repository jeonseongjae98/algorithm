import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int ans;
    static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[16][16];

            for (int j = 0; j < 16; j++) {
                String str = br.readLine();
                for (int k = 0; k < 16; k++) {
                    arr[j][k] = str.charAt(k) - '0';
                }
            }

            ans = 0;
            dfs(1, 1);
            System.out.println("#" + i + " " + ans);
        }
    }

    public static int[] dr = {0, 0, -1, 1};
    public static int[] dc = {-1, 1, 0, 0};

    static void dfs(int x, int y) {
        if (ans == 1) return;

        for (int i = 0; i < 4; i++) {
            int dx = x + dr[i];
            int dy = y + dc[i];

            if (dx < 0 || dy < 0 || dx >= 16 || dy >= 16) {
                continue;
            }
            if (arr[dx][dy] == 3) {
                ans = 1;
                return;
            }
            if (arr[dx][dy] == 0) {
                arr[dx][dy] = 1;
                dfs(dx, dy);
            }
        }
    }
}