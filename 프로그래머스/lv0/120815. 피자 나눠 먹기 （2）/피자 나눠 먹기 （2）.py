def solution(n):
    p = 1
    while(p < n):
        if (p * 6)  % n == 0:
            return p
        p += 1
    return p