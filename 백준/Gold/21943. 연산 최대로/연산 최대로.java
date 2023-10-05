import java.lang.reflect.Array;
import java.util.*;

class Main {
	static int n, a, b;
	static int[] arr;
	static int[] ans;
	static boolean[] visit;
	static ArrayList<Integer> list = new ArrayList<>();
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		ans = new int[n];
		visit = new boolean[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();
		dfs(0, 0, 0);
		System.out.println(max);
	}

	static void dfs(int x, int p, int q) {
		if (p <= a && q <= b) {
			if (x == n) {
				max = Math.max(max, calc());
				return;
			}
		}
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				list.add(arr[i]);
				if (x == 0)
					dfs(x + 1, p, q);
				else {
					ans[x] = 1;
					dfs(x + 1, p + 1, q);
					ans[x] = 2;
					dfs(x + 1, p, q + 1);
					ans[x] = 0;
				}
				list.remove(x);
				visit[i] = false;
			}
		}
	}

	static int calc() {
		ArrayList<Integer> temp_list = new ArrayList<>();
		int temp = list.get(0);
		for (int i = 1; i < n; i++) {
			if (ans[i] == 1)
				temp += list.get(i);
			if (ans[i] == 2) {
				temp_list.add(temp);
				temp = list.get(i);
			}
		}
		temp_list.add(temp);
		temp = 1;
		for (int i = 0; i < temp_list.size(); i++)
			temp *= temp_list.get(i);
		return temp;
	}
}