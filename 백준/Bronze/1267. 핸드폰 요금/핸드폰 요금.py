a = int(input())
li = list(map(int, input().split()))
f1 = []
f2= []
for i in range(len(li)):
    f1.append(((li[i]//30) * 10) + 10)
    f2.append(((li[i]//60) * 15) + 15)
s1 = sum(f1)
s2 = sum(f2)
if s1 > s2:
    print(f'M {s2}')
elif s2 > s1:
    print(f'Y {s1}')
else:
    print(f'Y M {s1}')