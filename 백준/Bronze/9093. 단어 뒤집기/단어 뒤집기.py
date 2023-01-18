T = int(input()) # 테스트 케이스 수
for i in range(T):
    a = input().split()
    for j in a:
        print(j[::-1], end= ' ')