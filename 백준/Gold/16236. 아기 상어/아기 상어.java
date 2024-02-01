import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dy = {-1, 0, 0, 1}; // Y좌표 이동 상하좌우
    static int[] dx = {0, -1, 1, 0}; // X좌표 이동 상하좌우
    static int[][] map; // 맵 정보 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 맵 크기

        map = new int[N][N];
        int[] cur = null; // 현재 상어의 위치

        // 맵 정보 입력
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    cur = new int[]{i, j}; // 상어의 초기 위치 저장
                    map[i][j] = 0; // 상어가 있는 위치를 0으로 초기화
                }
            }

        int size = 2; // 상어의 크기
        int eat = 0; // 먹은 물고기 수
        int move = 0; // 움직인 총 거리

        while (true) {
            PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) ->
                    o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
            );
            boolean[][] visit = new boolean[N][N];

            que.add(new int[]{cur[0], cur[1], 0}); // 현재 상어의 위치와 이동한 거리를 큐에 추가
            visit[cur[0]][cur[1]] = true;

            boolean ck = false; // 상어가 먹이를 먹었는지 체크할 변수

            // BFS 탐색
            while (!que.isEmpty()) {
                cur = que.poll(); // 큐에서 하나 꺼내옴

                // 먹이가 있으면서 상어의 사이즈보다 작다면?
                if (map[cur[0]][cur[1]] != 0 && map[cur[0]][cur[1]] < size) {
                    map[cur[0]][cur[1]] = 0; // 물고기를 제거
                    eat++;
                    move += cur[2]; // 움직인 거리를 총 움직인 거리에 추가
                    ck = true; // 먹이 먹었다고 체크
                    break;
                }

                // 상하좌우 탐색
                for (int k = 0; k < 4; k++) {
                    int ny = cur[0] + dy[k];
                    int nx = cur[1] + dx[k];

                    // 범위를 벗어나거나 이미 방문했거나 상어 크기보다 큰 물고기는 무시
                    if (ny < 0 || nx < 0 || nx >= N || ny >= N || visit[ny][nx] || map[ny][nx] > size)
                        continue;

                    que.add(new int[]{ny, nx, cur[2] + 1}); // 다음 위치와 이동한 거리를 큐에 추가
                    visit[ny][nx] = true; // 방문 체크
                }
            }

            // 큐가 비워질 때까지 먹이를 먹은적이 없다면, 더 이상 먹은 물고기가 없으므로 탈출
            if (!ck)
                break;

            // 사이즈와 먹이를 먹은 수가 동일하다면 상어의 크기를 증가
            if (size == eat) {
                size++;
                eat = 0;
            }
        }

        System.out.println(move); // 총 움직인 거리 출력
    }
}