def solution(n):
    c = n+1
    while True:
        if bin(c).count('1')==bin(n).count('1'):
            return c
        c+=1