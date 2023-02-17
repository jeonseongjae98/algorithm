import sys

def check(num):
    if num == 1: 
        return False
    else:
        for j in range(2, int(num**0.5)+1):
                if num % j == 0:
                    return False
        return True
all = [x for x in range(123456*2 + 1)]
li = []
for i in all:
    if check(i):
        li.append(i)

while True:
    a = int(sys.stdin.readline())
    cnt = 0
    if a == 0:
        break
    for i in li:
        if a < i <= 2*a:
            cnt += 1
    print(cnt)