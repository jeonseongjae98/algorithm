import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백만 개의 정수 정렬
// 퀵 정렬

public class Main {
	static int[] arr;
	static int[] sorted;
	static int result = -1;
	static int cnt = 0;
	static int k;
	static int n;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n]; // arr 배열 초기화
        sorted = new int[n]; // sorted 배열 초기화
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

		} // 배열에 넣기
		
		mergesort(0, arr.length - 1);
		System.out.print(result);

	}

	static void mergesort(int s, int e) {
		if (s < e) {
			int m = (s + e) / 2;
			mergesort(s, m);
			mergesort(m + 1, e);
			merge(s, m, e);
		}
	}

	static void merge(int s, int m, int e) {
		int l = s;
		int r = m + 1;
		int idx = s;
		while(l <= m && r <= e) {
			if(arr[l] <= arr[r]) {
				sorted[idx++] = arr[l++]; 
				cnt++;
				if(cnt == k && result == -1) {
					result = sorted[idx-1];
				}
			}else {
				sorted[idx++] = arr[r++];
				cnt++;
				if(cnt == k && result == -1) {
					result = sorted[idx-1];
				
				}
			}
		}
		if(l <= m) {
			for(int i = l; i<= m; i++) {
				sorted[idx++] = arr[i];
				cnt++;
				if(cnt == k && result == -1) {
					result = sorted[idx-1];
				
				}
			}
		}
		else {
			for (int i = r; i <= e; i++) {
                sorted[idx++] = arr[i];
                cnt++;
				if(cnt == k && result == -1) {
					result = sorted[idx-1];
				
				}
            }
		}
		for(int i=s;i<=e;i++) arr[i]=sorted[i];
	}
}