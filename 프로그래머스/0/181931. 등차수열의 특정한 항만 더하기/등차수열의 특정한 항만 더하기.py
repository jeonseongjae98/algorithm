def solution(a, d, included):
    answer = 0
    for i in range(len(included)):
        if(included[i]):
            answer += (a + i * d)
        
        
    
    return answer