import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 1; tc <= 10; tc++) {
			StringBuilder sb = new StringBuilder();
			int T = Integer.parseInt(br.readLine());
			Queue<Integer> q = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 8; j++) {
				q.add(Integer.parseInt(st.nextToken()));
				} // 큐에 넣기
				Loop:
					while(true) {
					int a;
					for (int i = 1; i <= 5; i++) {
						a = q.remove();
						if(a - i <= 0) {
							q.offer(0);
							break Loop;
						}
						q.offer(a-i);
				}
					}
				System.out.print("#" + tc + " ");
				for(int i=0;i<8;i++) {
					sb.append(q.remove()+" ");
				}
				System.out.println(sb.toString());


				
				
			}

		}

	}

