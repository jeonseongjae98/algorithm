import heapq
def solution(operations):
    answer = []
    q = []
    for o in operations:
        x, num = o.split()
        num = int(num)
        
        if x == 'I':
            heapq.heappush(q, num)
        elif x == 'D' and num == 1:
            if len(q) != 0:
                max_v = max(q)
                q.remove(max_v)
        else:
            if len(q) != 0:
                heapq.heappop(q)
    if len(q) == 0:
        answer = [0, 0]
    else:
        answer = [max(q), heapq.heappop(q)]
        
    
    
    return answer