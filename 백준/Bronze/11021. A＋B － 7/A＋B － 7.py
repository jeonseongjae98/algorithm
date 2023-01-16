T = int(input()) # 테스트 케이스 수

for t in range(1, T+1):
    A, B = map(int, input().split())
    ADD = A + B
    print(f'Case #{t}: {ADD}')