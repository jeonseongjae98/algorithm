T = int(input()) # 테스트 케이스 수
A = map(int, input().split())
cnt = 0
for i in A:
    for j in range(2, i+1):
        if i % j == 0:
            if i == j:
                cnt += 1
            break
            
print(cnt)