from collections import deque

def solution(maps):
    
    def bfs(start, end):
        visited = [[0 for _ in range(m)] for _ in range(n)]
        q = deque()
        q.append(start)
        
        while q:
            now = q.popleft()
            for i in range(4):
                nrow = now[0] +move[i][0]
                ncol = now[1] +move[i][1]
                
                if 0<=nrow<n and  0<=ncol<m and not visited[nrow][ncol] and graph[nrow][ncol] != 'X':
                    visited[nrow][ncol] = visited[now[0]][now[1]]+1
                    q.append([nrow, ncol])
        
        return visited[end[0]][end[1]]
    
    answer = 0
    graph = [list(i) for i in maps]
    n = len(graph)
    m = len(graph[0])
    move = [[0,1], [0,-1], [-1,0], [1,0]]
    
    for row in range(len(graph)):
        if ('S' in graph[row]):
            start = [row, graph[row].index('S')]
        if ('L' in graph[row]):
            lever = [row, graph[row].index('L')]
        if ('E' in graph[row]):
            end = [row, graph[row].index('E')]
    
    distance1 = bfs(start, lever)
    distance2 = bfs(lever, end)
    
    if distance1 == 0 or distance2 == 0:
        answer = -1
    else:
        answer = distance1 + distance2
    
    return answer

    
            
    