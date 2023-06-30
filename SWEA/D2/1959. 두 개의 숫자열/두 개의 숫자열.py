T = int(input())

for tc in range(1, T+1):

    N, M = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    total = 0

    if N <= M:
        short, long = N, M
        min_lst = A
        max_lst = B
    else:
        short, long = M, N
        min_lst = B
        max_lst = A

    for i in range(long - short + 1):
        temp = 0
        for j in range(short):
            temp += min_lst[j] * max_lst[i+j]
        if total <= temp:
            total = temp

    print(f"#{tc} {total}")