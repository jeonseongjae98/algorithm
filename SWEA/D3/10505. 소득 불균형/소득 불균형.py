T = int(input()) # 테스트 케이스 수
for t in range(1, T+1):
    cnt = 0
    N = int(input())
    money = list(map(int, input().split()))
    for i in money:
        if i <= sum(money)/len(money):
            cnt += 1
    print(f'#{t} {cnt}')