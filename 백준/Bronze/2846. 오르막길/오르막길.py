num = int(input())
li = list(map(int, input().split()))
re = []
a = 0
for i in range(num-1):
    if li[i] < li[i+1]:
        a += li[i+1] - li[i]
    else:
        re.append(a)
        a = 0
re.append(a)
print(max(re))