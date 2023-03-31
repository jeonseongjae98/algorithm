import math

def solution(n):
    if int(math.sqrt(n)) * int(math.sqrt(n)) == n:
        return 1
    else:
        return 2