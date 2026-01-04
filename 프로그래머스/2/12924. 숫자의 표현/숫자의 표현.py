def solution(n):
    answer = 0
    for i in range(1, n+1):
        sumn = 0
        for j in range(i, n+1):
            sumn += j
            if sumn == n:
                answer+=1
                break
            elif sumn > n:
                break            
        
    return answer