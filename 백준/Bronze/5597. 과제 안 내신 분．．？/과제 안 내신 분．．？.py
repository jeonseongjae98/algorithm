a =[i for i in range(1, 31)]
for j in range(28):
    b = int(input())
    if b in a:
        a.pop(a.index(b))
        a.sort()
print(a[0])
print(a[1])
    
