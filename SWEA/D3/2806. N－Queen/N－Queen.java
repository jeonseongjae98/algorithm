import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	static int[] board; // 행을 인덱스로 열값
	static int n, ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(br.readLine());
		
		
		for (int tc = 1; tc <= T; tc++) {
			n = Integer.parseInt(br.readLine()); // n*n보드에서 n개의 퀸
			board = new int[n]; //열 좌표값
			ans = 0;
			game(0); // 0행부터 탐색
			System.out.printf("#%d %d\n", tc, ans);
		}
	}

	private static void game(int idx) {
		// 기저
		if (idx == n) {
			ans++;
			return;
		}
		for (int y = 0; y < n; y++) { // 같은 행에서 열만 옮겨 검사
			// 재귀 - q를 돌며 - 안되면 열옮기고 들어가도 되면 다음행으로 재귀
			if (chk(idx, y)) {
				// 들어가도 되는 칸임 재귀재귀
				board[idx] = y;
				game(idx + 1);
			}
		}
	}

	private static boolean chk(int idx, int y) { // q의 크기 = 행 좌표
		// 재귀 - q를 돌며 - 안되면 열옮기고 들어가도 되면 다음행으로 재귀
		for (int k = 0; k < idx; k++) { // 첫 행(k)부터 입력받은 row 행까지 열과 대각선에 대한 검사 실시
			// 행, 열이 같거나 abs(행-행, 열-열)이 같을 때 넘어가기
			if (board[k] == y || Math.abs(k - idx) == Math.abs(board[k] - y))
				return false;
		}
		return true;
	}
}