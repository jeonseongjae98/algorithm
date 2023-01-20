T = int(input()) # 테스트 케이스 수

for t in range(1, T+1):
    N = list(map(int, input().split()))
    for i in N:
        if N.count(i) == 1: # 개수가 1개인 경우  
            print(f'#{t} {i}')
            break

        elif N.count(i) == 3: # 개수가 3개인 경우 
            print(f'#{t} {i}')
            break