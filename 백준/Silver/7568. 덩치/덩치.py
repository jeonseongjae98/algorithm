#2
import sys
input = sys.stdin.readline

n = int(input())
li = []
li1 = []
for _ in range(n):
	li.append(list(map(int, input().split())))

for i in range(len(li)):
  cnt = 0
  for j in range(len(li)):
    if li[i][0] < li[j][0] and li[i][1] < li[j][1]:
      cnt += 1
  li1. append(cnt + 1)

print(*li1)