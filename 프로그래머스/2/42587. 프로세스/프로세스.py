def solution(priorities, location):
    answer = 0
    q = [(i, p) for i,p in enumerate(priorities)]
    while True:
        cur = q.pop(0)
        if any(cur[1] < e[1] for e in q):
            q.append(cur)
        else:
            answer+=1
            if cur[0] == location:
                return answer