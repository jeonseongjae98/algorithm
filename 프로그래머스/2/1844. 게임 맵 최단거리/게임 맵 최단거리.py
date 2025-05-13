from collections import deque

def solution(maps):
    visited = [[False]*len(maps[0]) for _ in range(len(maps))]
    q = deque()
    q.append((0,0))
    dx = [0,0,-1, 1]
    dy = [1,-1,0,0]
    visited[0][0] = True
    
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]) and maps[nx][ny] == 1 and not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))
                maps[nx][ny] = maps[x][y] + 1
    if maps[len(maps)-1][len(maps[0])-1] == 1:
        return -1
    else:
        return maps[len(maps)-1][len(maps[0])-1]
    