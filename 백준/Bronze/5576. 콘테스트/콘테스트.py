li = []
li1 = []
for i in range(20):
    a= int(input())
    if i < 10:
        li.append(a)
    else: 
        li1.append(a)
li.sort(reverse=True)
li1.sort(reverse=True)
b = li[0]+li[1]+li[2]
c = li1[0]+li1[1]+li1[2]
print(b, c)