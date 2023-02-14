n = int(input())
cnt = 1
plus = 6
result = 1
while n > result:
    cnt += 1
    result += plus
    plus += 6
print(cnt)