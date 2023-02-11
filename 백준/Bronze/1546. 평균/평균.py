a = int(input())
b = list(map(int, input().split()))
c = max(b)
li = []
for i in range(len(b)):
    d = (b[i] / c) * 100
    li.append(d)
print(sum(li)/len(li))