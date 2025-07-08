def solution(cards):
    answer = []
    visited = [False] * (len(cards)+1)
    for i in cards:
        if not visited[i]:
            tmp = []
            while i not in tmp:
                tmp.append(i)
                i = cards[i-1]
                visited[i] = True
                
            answer.append(len(tmp))
    if answer[0] == len(cards):
        return 0
    else:
        answer.sort(reverse=True)
    return answer[0]*answer[1]