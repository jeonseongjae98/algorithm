T = int(input()) # 테스트 케이스 수
for t in range(T):
    A, B, V = map(int, input().split())
    if V % A == 0:
        x = A
        y = V // A
    else:
        x = V % A
        y = V // A + 1
    print(x * 100 + y)
