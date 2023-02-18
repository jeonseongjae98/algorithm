a, b = map(int, input().split())
li1 = []
li2 = []
for _ in range(a):
    li1.append(list(map(int, input().split())))
for _ in range(a):
    li2.append(list(map(int, input().split())))

for i in range(a):
    for j in range(b):
        print(li1[i][j] + li2[i][j], end = ' ')
    print()