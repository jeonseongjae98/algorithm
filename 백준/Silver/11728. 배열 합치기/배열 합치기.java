import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {

			list.add(Integer.parseInt(st.nextToken()));

		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			list.add(Integer.parseInt(st.nextToken()));

		}

		list.sort(Comparator.naturalOrder());

		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}
		System.out.println(sb);
	}
}
