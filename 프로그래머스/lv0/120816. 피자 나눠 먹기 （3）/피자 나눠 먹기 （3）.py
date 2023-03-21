def solution(slice, n):
    answer = n // slice
    if (n % slice) != 0:
        answer +=1
        
    return answer