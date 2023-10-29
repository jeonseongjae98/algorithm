import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] stack = new int[N];
		
		int idx = 0;
		int start = 0;
		
		// N 번 반복
		while(N -- > 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				// start + 1부터 입력받은 value 까지 push를 한다.
				for(int i = start + 1; i <= value; i++) {
					stack[idx] = i;
					idx++;
					sb.append('+').append('\n');
				}
				start = value; 	// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화 
			}
			
			// top에 있는 원소가 입력받은 값과 같이 않은 경우  
			else if(stack[idx - 1] != value) {
					System.out.println("NO");
					System.exit(0);	//	return 으로 대체해도 됨 
			}
			
			idx--;
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}
 
}