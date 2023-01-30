li = []
for i in range(5):
    a = list(map(int, input().split()))
    li.append(sum(a))

print(li.index(max(li))+1, max(li))
