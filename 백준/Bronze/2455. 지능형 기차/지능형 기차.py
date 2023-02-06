li = []
result = 0
for i in range(4):
    a, b = map(int, input().split())
    result -= a
    result += b
    li.append(result)
print(max(li))