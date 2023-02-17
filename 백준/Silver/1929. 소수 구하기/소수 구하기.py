import sys
a, b = map(int, sys.stdin.readline().split())

def check(num):
    if num == 1: 
        return False
    else:
        for j in range(2, int(num**0.5)+1):
                if i % j == 0:
                    return False
        return True
        
for i in range(a, b+1):
    if check(i):
        print(i)