import sys

def check(num):
    if num == 1: 
        return False
    else:
        for j in range(2, int(num**0.5)+1):
                if num % j == 0:
                    return False
        return True

for _ in range(int(input())):
    num = int(input())
    a, b = num//2, num//2
    while a > 0:
        if check(a) and check(b):
            print(a, b)
            break
        else:
            a -= 1
            b += 1