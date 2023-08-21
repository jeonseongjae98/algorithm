import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String re = "Possible";  
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            ArrayList<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(st.nextToken());
                q.add(tmp);
            }
            Collections.sort(q);
            
            for (int i = 0; i < n; i++) {
                int a = q.get(i);
                if ((a / m) * k < i + 1) {
                    re = "Impossible";
                }
            }
            
            System.out.printf("#%d %s%n", tc, re); 
        }
    }
}
