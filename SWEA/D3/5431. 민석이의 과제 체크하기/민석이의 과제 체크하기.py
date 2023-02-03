T = int(input()) # 테스트 케이스 수
for i in range(T):
    li = []
    a, b = map(int, input().split())
    c = list(map(int, input().split()))
    for j in range(1, a+1):
        if j not in c:
            li.append(j)
    print(f'#{i+1}', *li)
