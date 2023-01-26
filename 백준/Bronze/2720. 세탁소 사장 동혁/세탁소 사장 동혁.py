T = int(input()) # 테스트 케이스 수
for i in range(T):
    N = int(input())
    M = [25, 10, 5, 1]
    result = []
    for j in M:
        result.append(N // j)
        N = N % j
    print(*result)