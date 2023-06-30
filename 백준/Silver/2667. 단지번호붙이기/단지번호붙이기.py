import sys
input = sys.stdin.readline

n  = int(input())
map = [list(map(int, input().strip())) for _ in range(n)]
chk = [[False] * n for _ in range(n)]
result = []
each = 0


dy = [0, 1, 0, -1]
dx = [1, 0, -1, 0]

def dfs(y, x):
    global each
    each += 1
    for k in range(4):
        ny = y + dy[k]
        nx = x + dx[k]
        if 0 <= ny < n and 0 <= nx < n:
            if map[ny][nx] == 1 and chk[ny][nx] == False:
                chk[ny][nx] = True
                dfs(ny, nx)



for j in range(n):
    for i in range(n):
         if map[j][i] == 1 and chk[j][i] == False:
              chk[j][i] = True
              each = 0
              dfs(j, i)
              result.append(each)

result.sort()
print(len(result))
for i in result:
    print(i)
              
