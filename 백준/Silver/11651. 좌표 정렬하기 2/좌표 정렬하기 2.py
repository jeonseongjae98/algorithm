import sys
input = sys.stdin.readline

n = int(input())
points = []

for i in range(n):
    x, y = map(int, input().split())
    points.append((x, y))

points = sorted(points, key = lambda x: (x[1], x[0]))

for x, y in points:
    print(x, y)
