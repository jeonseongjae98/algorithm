T = int(input())
for test_case in range(1, T + 1):
    a = list(map(int, input().split()))

    average = round(sum(a)/len(a))
    print(f'#{test_case} {average}')