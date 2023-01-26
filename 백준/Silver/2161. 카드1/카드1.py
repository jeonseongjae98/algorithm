n = int(input())
q = [i for i in range(1, n+1)]
d = []
while len(q) > 1:
    d.append(q.pop(0))
    q.append(q.pop(0))
print(*d, *q)