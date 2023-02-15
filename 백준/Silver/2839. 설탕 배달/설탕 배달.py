n = int(input())
cnt = 0
if n % 5 == 0:
    print(n//5)
else:
    while n >= 0:
        n -= 3
        cnt += 1
        if n % 5 == 0:
            cnt += n // 5
            print(cnt)
            break
        elif n == 1 or n == 2:
            print(-1)
            break
        elif n == 0:
            print(cnt)
            break