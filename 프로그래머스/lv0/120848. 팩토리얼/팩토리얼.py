def solution(n):
    answer = 0
    fac = 1
    while(n>=fac):
        answer += 1
        fac = fac * answer
    
    answer -= 1

    return answer