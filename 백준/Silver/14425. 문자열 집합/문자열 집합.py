import sys
input = sys.stdin.readline

A, B = map(int, input().split())
s = set([input() for i in range(A)])
cnt = 0
for i in range(B):
    t = input()
    if t in s:
        cnt += 1
print(cnt)