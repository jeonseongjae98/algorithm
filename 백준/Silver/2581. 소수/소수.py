T = int(input()) 
A = int(input())
cnt = 0
li = []
for i in range(T, A+1):
    for j in range(2, i+1):
        if i % j == 0:
            if i == j:
                cnt += 1
                li.append(i)
            break
if cnt == 0:
    print(-1)
else:    
    print(sum(li))
    print(min(li))