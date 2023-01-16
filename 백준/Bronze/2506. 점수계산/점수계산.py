T = int(input()) # 테스트 케이스 수
score = 0
add = 0
A = list(map(int,input().split()))

for t in range(T):
    if A[t] == 1:
        add += 1
        score += add
    else:
        add = 0
print(score)