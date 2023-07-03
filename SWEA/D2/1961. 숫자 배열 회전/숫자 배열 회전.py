# 테스트 케이스 T 입력
T = int(input())
for tc in range(1, T+1):
    # 행렬의 N 값 입력
    N = int(input())

    # NxN 행렬 입력
    arr = [list(map(int, input().split())) for _ in range(N)]

    # 90도, 180,도 270도 회전한 행렬 초기화
    arr_90 = [[0] * N for _ in range(N)]
    arr_180 = [[0] * N for _ in range(N)]
    arr_270 = [[0] * N for _ in range(N)]

    # arr 행렬 90도 회전
    for i in range(N):
        for j in range(N):
            arr_90[i][j] = arr[N-1-j][i]

    # arr_90 행렬을 90도 회전하면 arr_180 행렬
    for i in range(N):
        for j in range(N):
            arr_180[i][j] = arr_90[N-1-j][i]

    # arr_180 행렬을 90도 회전하면 arr_270 행렬
    for i in range(N):
        for j in range(N):
            arr_270[i][j] = arr_180[N-1-j][i]

    # 결과 출력
    print(f'#{tc}')
    for i in range(N):
        print(*arr_90[i], end=' ', sep ='')
        print(*arr_180[i], end=' ', sep ='')
        print(*arr_270[i], end=' ', sep ='')
        print()