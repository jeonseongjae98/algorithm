T = int(input()) # 테스트 케이스 수
for t in range(T):
    N,  M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    result = []

    for i in range(N-M+1):
        for j in range(N-M+1):
            sum = 0
            for k in range(M):
                for l in range(M):
                    sum += arr[i+k][j+l]
            result.append(sum)

    print(f'#{t+1}', max(result))