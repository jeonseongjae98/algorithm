T = int(input()) # 테스트 케이스 수

for t in range(T):
    n = int(input())
    a = []
    a.append(n // 25)
    n %= 25
    a.append(n // 10)
    n %= 10
    a.append(n // 5)
    n %= 5
    a.append(n // 1)
    print(*a)
