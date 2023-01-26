T = int(input()) # 테스트 케이스 수
li = [0 for i in range(101)]
cnt = 0
N = list(map(int, input().split()))
for i in N:
    if li[i] == 0:
        li[i] = 1
    else:
        cnt += 1 
print(cnt)