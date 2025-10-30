from collections import deque

def solution(begin, target, words):
    if target not in words:
        return 0
    
    return bfs(begin, target, words)

def bfs(begin, target, words):
    q = deque()
    q.append([begin, 0])
    while q:
        now, step = q.popleft()
        if now == target:
            return step
        
        for w in words:
            count = 0
            for i in range(len(now)):
                if now[i] != w[i]:
                    count+=1
            if count == 1:
                q.append([w, step+1])