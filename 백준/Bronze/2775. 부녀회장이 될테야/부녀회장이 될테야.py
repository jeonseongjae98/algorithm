T = int(input()) # 테스트 케이스 수
for t in range(1, T+1):
    k = int(input())
    n = int(input())
    p = [i for i in range(1, n+1)]
    for i in range(k):
        new = []
        for j in range(n):
            new.append(sum(p[:j+1]))
        p = new
    print(p[-1])