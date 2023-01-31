import sys
input = sys.stdin.readline

N = int(input())
matrix = [list(map(str, input().strip())) for _ in range(N)]

row = 0
column = 0

for y in range(N):
    cnt = 0
    for x in range(N):
        if matrix[y][x] == '.':
            cnt += 1

        elif matrix[y][x] == 'X':
            if cnt >= 2:
                row += 1
            cnt = 0
    if cnt >= 2:
        row += 1
    cnt = 0

for x in range(N):
    cnt = 0
    for y in range(N):
        if matrix[y][x] == '.':
            cnt += 1

        elif matrix[y][x] == 'X':
            if cnt >= 2:
                column += 1
            cnt = 0
    if cnt >= 2:
        column += 1
    cnt = 0

print(row, column)