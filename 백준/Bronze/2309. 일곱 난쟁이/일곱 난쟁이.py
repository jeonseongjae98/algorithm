import sys

heights = []
for i in range(9):
    heights.append(int(sys.stdin.readline()))
a = sum(heights)
one = 0
two = 0

for i in range(9):
    for j in range(i+1, 9):
        if a - (heights[i] + heights[j]) == 100:
            one, two = heights[i], heights[j]
            break
heights.remove(one)
heights.remove(two)
heights.sort()
for i in heights:
    print(i)