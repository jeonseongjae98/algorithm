T = int(input())
for test_case in range(1, T + 1):
    a = list(map(int,input().split()))
    print(f'#{test_case} {max(a)}')