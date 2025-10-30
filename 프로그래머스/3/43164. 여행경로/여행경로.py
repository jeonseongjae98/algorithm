from collections import defaultdict
def solution(tickets):
    td = defaultdict(list)
    
    for s,e in tickets:
        td[s].append(e)
    
    for tk in td.keys():
        td[tk].sort(reverse = True)
        
    answer = []
    path = ["ICN"]
    
    while path:
        now = path[-1]
        
        if len(td[now]) ==0:
            answer.append(path.pop())
        else:
            path.append(td[now].pop())
    return answer[::-1]