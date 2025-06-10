from collections import *
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def solution(board):
    answer = 0
    n = len(board)
    m = len(board[0])
    q = deque()
    dist = [[float('inf') for _ in range(m)] for _ in range(n)]
    
    for i in range(n):
        for j in range(m):
            if board[i][j] == 'R':
                q.append((i,j,0))
                dist[i][j] = 0
        if q:
            break
    while q:
        x,y,c = q.popleft()
        if board[x][y] == 'G':
            return c
            
        for i in range(4):
            nx = x
            ny = y
            while 0<=nx+dx[i]<n and 0<=ny+dy[i]<m and board[nx+dx[i]][ny+dy[i]] != 'D':
                nx+=dx[i]
                ny+=dy[i]
            if dist[nx][ny] > c+1:
                dist[nx][ny] = c+1
                q.append((nx,ny,c+1))
                        
            
    return -1