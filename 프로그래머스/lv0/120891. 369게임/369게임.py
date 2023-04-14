def solution(order):
    answer = 0
    for i in range(len(str(order))):
        a = order % 10
        if a in [3, 6, 9]:
            answer += 1
        order //=10
        
    return answer