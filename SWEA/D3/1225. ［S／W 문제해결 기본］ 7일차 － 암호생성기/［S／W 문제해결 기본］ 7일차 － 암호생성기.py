for t in range(10):
    T = int(input())
    num = list(map(int, input().split()))
    while num[-1] != 0:
        for i in range(5):
            num.append(num.pop(0)-(i+1))
            if num[-1] <= 0:
                num[-1] = 0
                break
    print(f'#{t+1}', *num)