def solution(n):
    answer = []
    d = 2
    while(d <= n):
        if n % d == 0:
            answer.append(d)
            n /= d 
        else:
            d += 1
    li = list(set(answer))
    li.sort()
    return li