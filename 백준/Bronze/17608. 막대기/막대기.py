import sys
input = sys.stdin.readline

n = int(input())
li = []

for _ in range(n):
	li.append(int(input()))

l = li[-1]
cnt = 1

for i in reversed(range(len(li))):
  if l < li[i]:
    cnt += 1
    l = li[i]

print(cnt)