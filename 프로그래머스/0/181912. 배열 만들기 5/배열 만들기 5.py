def solution(intStrs, k, s, l):
    answer = []
    for x in intStrs:
        if int(x[s:s+l]) > k:
            answer.append(int(x[s:s+l]))
    
    return answer