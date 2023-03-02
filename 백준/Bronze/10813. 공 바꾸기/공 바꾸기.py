N, M = map(int, input().split())
li = [i for i in range(1, N+1)]
for i in range(M):
    a, b = map(int, input().split())
    li[a-1], li[b-1] = li[b-1], li[a-1]
print(*li)