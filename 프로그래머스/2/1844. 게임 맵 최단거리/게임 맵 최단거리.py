from collections import deque

def solution(maps):
    answer = 0
    visited = [[False]*len(maps[0]) for _ in range(len(maps))]
    q = deque()
    q.append((0,0))
    dr = [0,0,-1,1]
    dc = [1,-1,0,0]
    visited[0][0] = True
    
    while q:
        r,c = q.popleft()
        for i in range(4):
            nr = dr[i]+r
            nc = dc[i]+c
            if 0 <= nr <len(maps) and 0<= nc <len(maps[0]) and not visited[nr][nc] and maps[nr][nc]==1:
                visited[nr][nc] = True
                q.append((nr,nc))
                maps[nr][nc] = maps[r][c] + 1
    
    if maps[len(maps)-1][len(maps[0])-1] == 1:
        return -1
    
    else:
        return maps[len(maps)-1][len(maps[0])-1]
               
               