import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(); // 전투력에 대한 칭호를 매번 출력해도 시간초과에 걸리더라
		                                        // StringBuilder에 하나씩 붙여놓고 한 번에 출력하기
		
		int N = Integer.parseInt(st.nextToken()); // 칭호 갯수
		int M = Integer.parseInt(st.nextToken()); // 전투력 갯수
		
		String[] title = new String[N]; // 칭호
		int[] titlePower = new int[N]; // 칭호 기준 전투력
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			title[i] = st.nextToken();
			titlePower[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int start = 0;
			int last = N-1;

			while(start <= last) {
				int mid = (start+last) / 2;
				
				if(titlePower[mid] < num) { // 입력값이 mid보다 크다면 원하는 지점은 mid 미만에는 없으니 start 지점을 mid 다음 인덱스로 잡는다
					start = mid + 1;
				}
				
				else { // 입력값이 mid보다 작다면 원하는 지점은 mid 초과에는 없으니 last 지점을 mid 이전 인덱스로 잡는다
					last = mid - 1;
				}
			}
			sb.append(title[start]).append("\n"); // title[start] 혹은 title[last+1]로 가능
		}
		System.out.println(sb.toString());
	}
}