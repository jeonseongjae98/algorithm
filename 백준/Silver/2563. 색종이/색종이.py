arr = [[0 for _ in range(101)] for _ in range(101)]
result = 0
T = int(input()) 
for _ in range(T):
    x, y = map(int, input().split())
    for i in range(x, x+10):
        for j in range(y, y+10):
            arr[i][j] = 1


for i in arr:
    result += sum(i)

print(result)
