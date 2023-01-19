a = []
for i in range(7):
    n = int(input())
    if n % 2 == 1:
        a.append(n)
if a:
    print(sum(a), min(a), sep='\n')
else:
    print(-1)