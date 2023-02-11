T = int(input())
for _ in range(T):
    b = list(map(int, input().split()))
    sum = 0
    cnt = 0
    for i in range(1, len(b)):
        sum += b[i]
    a = (sum / b[0])
    for i in range(1, len(b)):
        if b[i] > a:
            cnt += 1
    print(f'{(cnt/b[0] * 100):.3f}%')

