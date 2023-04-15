def solution(num, k):
    answer = 0
    if str(k) not in str(num):
        return -1
    
    for i in str(num):
        answer += 1
        if i == str(k):
            break
    return answer