import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine()); // 원본 암호문의 길이

			StringTokenizer st = new StringTokenizer(br.readLine());
			LinkedList<Integer> list = new LinkedList<>();

			for (int i = 0; i < N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}

			int M = Integer.parseInt(br.readLine()); // 명령어 개수
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				String s = st.nextToken();
				if (s.equals("I")) {
					int idx = Integer.parseInt(st.nextToken());
					int m = Integer.parseInt(st.nextToken());
					for (int j = 0; j < m; j++) {
						list.add(idx++, Integer.parseInt(st.nextToken()));
					}
				}
				else if(s.equals("A")) {
					int m = Integer.parseInt(st.nextToken());
					for (int j = 0; j < m; j++) {
						list.addLast(Integer.parseInt(st.nextToken()));
					}
				}
				else {
					int m = Integer.parseInt(st.nextToken());
					int m1 = Integer.parseInt(st.nextToken());
					for (int j = 0; j < m1; j++) {
						list.remove(m);
					}
					
				}
			}

			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();

		}

	}

}