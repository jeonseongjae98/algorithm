from collections import deque
def solution(x, y, n):
    answer = 0
    
    queue = deque()
    queue.append((x, 0))
    visited = set()
    while queue:
        i, j = queue.popleft()
        if i > y or i in visited:
            continue
        visited.add(i)
        if i == y:
            return j
        for k in (i*3, i*2, i+n):
            if k <= y and k not in visited:
                queue.append((k, j+1))
    return -1