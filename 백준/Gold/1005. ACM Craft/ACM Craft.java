
//https://blog.itcode.dev/posts/2021/06/01/a1005

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringBuilder builder = new StringBuilder();

		// 케이스 갯수
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			// 건물 갯수
			int N = scanner.nextInt();

			// 규칙(건설시간) 갯수
			int K = scanner.nextInt();

			// 건물별 건설시간 배열
			int[] time = new int[N + 1];

			// 건물별 연결여부 배열
			boolean[][] matrix = new boolean[N + 1][N + 1];

			// 건물별 연결 갯수 배열
			int[] link = new int[N + 1];

			for (int j = 1; j < N + 1; j++) {
				time[j] = scanner.nextInt();
			}

			for (int j = 0; j < K; j++) {
				// 하위 건물
				int X = scanner.nextInt();

				// 상위 건물
				int Y = scanner.nextInt();

				matrix[X][Y] = true;
				link[Y]++;
			}

			// 목표 건물
			int W = scanner.nextInt();

			builder.append(calcTopologicalSort(time, matrix, link)[W]).append("\n");
		}

		System.out.println(builder.toString());

		scanner.close();
	}

	/**
	 * 위상정렬 결과 반환 함수
	 *
	 * @param time: [int[]] 건물별 건설시간
	 * @param matrix: [boolean[][]] 건물별 연결여부
	 * @param link: [int[]] 건물별 연결 갯수
	 *
	 * @return [int[]] 건물별 종 건설시간 배열
	 */
	private static int[] calcTopologicalSort(int[] time, boolean[][] matrix, int[] link) {
		Queue<Integer> queue = new LinkedList<>();

		int[] result = new int[link.length];

		for (int i = 1; i < link.length; i++) {
			// 요구 건물이 없는 건물일 경우
			if (link[i] == 0) {
				result[i] = time[i];
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			// 하위 건물
			int prev = queue.poll();

			for (int i = 1; i < link.length; i++) {
				// 하위 건물 건설을 요구 하는 건물일 경우
				if (matrix[prev][i]) {
					result[i] = Math.max(result[i], result[prev] + time[i]);

					// 해당 건물의 요구 건물 갯수 1 감소
					--link[i];

					// 요구 건물이 없는 건물일 경우
					if (link[i] == 0) {
						queue.add(i);
					}
				}
			}
		}

		return result;
	}
}