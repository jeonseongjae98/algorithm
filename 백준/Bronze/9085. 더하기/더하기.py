T = int(input()) # 테스트 케이스 수
for i in range(T):
    A = int(input())
    B = list(map(int,input().split()))
    print(sum(B))