from collections import deque

dx, dy = [0, 0, -1, 1], [-1, 1, 0, 0]
def bfs(maps, i, j, n, m, visit):
    queue = deque()
    queue.append((i, j))
    visit[i][j] = 1
    area = int(maps[i][j])
    while queue:
        x, y = queue.popleft()
        for d in range(4):
            nx, ny = x + dx[d], y + dy[d]
            if 0 <= nx < n and 0 <= ny < m and visit[nx][ny] == 0 and maps[nx][ny] != 'X':
                visit[nx][ny] = 1 
                area += int(maps[nx][ny])
                queue.append((nx, ny))
    return area

def solution(maps):
    answer = []
    n, m = len(maps), len(maps[0])
    visit = [[0] * m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if maps[i][j] != 'X' and visit[i][j] == 0:
                answer.append(bfs(maps, i, j, n, m, visit))
                
    if answer:
        return sorted(answer)
    else:
        return [-1]
    
    