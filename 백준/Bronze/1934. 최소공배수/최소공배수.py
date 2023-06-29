import math

num = int(input())

for i in range(num):
  x, y = map(int, input().split(" "))
  print(math.lcm(x, y))

