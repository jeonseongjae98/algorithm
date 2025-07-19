from collections import deque

def solution(storage, requests):
    h, w = len(storage) + 2, len(storage[0]) + 2 
    directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
    
    def inside(x, y):
        return 0 <= x < w and 0 <= y < h 

    arr = [['-'] * w for _ in range(h)]
    for i in range(len(storage)):                         
        for j in range(len(storage[0])):                  
            arr[i + 1][j + 1] = storage[i][j]             

    def bfs():
        visited = [[0] * w for _ in range(h)]             
        visited[0][0] = 1
        queue = deque([(0, 0)])                           

        while queue:
            x, y = queue.popleft()
            for dx, dy in directions:
                nx, ny = x + dx, y + dy
                
                if inside(nx, ny) and arr[ny][nx] == '-' and not visited[ny][nx]:
                    visited[ny][nx] = 1
                    queue.append((nx, ny))
        return visited

  
    for r in requests:
        target = r[0]
        if len(r) == 2: 
            for i in range(h):
                for j in range(w):
                    if arr[i][j] == target:
                        arr[i][j] = '-'
        else:  
            boundary = bfs() 
            remove = []
            for i in range(1, h - 1):
                for j in range(1, w - 1):
                    if arr[i][j] == target:
                        
                        if any(inside(j+dx, i+dy) and boundary[i+dy][j+dx] for dx, dy in directions):
                            remove.append((j, i))
            for x, y in remove:
                arr[y][x] = '-'
    

    answer = 0
    for i in range(h):
        for j in range(w):
            if arr[i][j] != '-':
                answer += 1

    return answer
