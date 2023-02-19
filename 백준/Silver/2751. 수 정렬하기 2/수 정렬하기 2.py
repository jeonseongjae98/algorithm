import sys
a = int(input())
li = []
for _ in range(a):
    li.append(int(sys.stdin.readline()))

li.sort()
print(*li, sep = '\n')
