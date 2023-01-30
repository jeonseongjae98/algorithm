matrix = [[0] * 100 for _ in range(100 + 1)]
result = 0
for i in range(4):
    x, y, x1, y1 = map(int, input().split())
    for i in range(x, x1):
        for j in range(y, y1):
            matrix[i][j] = 1

for i in matrix:
    result += sum(i)
print(result)
