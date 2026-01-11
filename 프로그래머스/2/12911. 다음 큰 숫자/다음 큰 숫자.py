def solution(n):
    answer = 0
    cnt = 0
    while(True):
        cnt += 1
        m = n + cnt
        if bin(n)[2:].count('1') == bin(m)[2:].count('1'):
            answer = m
            break
        
    
    return answer