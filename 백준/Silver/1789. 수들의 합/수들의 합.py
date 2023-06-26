a = int(input())
cnt = 0
total = 0
while a >= total:
    cnt += 1
    total += cnt
print(cnt - 1)