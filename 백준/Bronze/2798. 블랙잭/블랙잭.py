a, b = map(int, input().split())
card = list(map(int, input().split()))
li = []
for i in range(a-2):
    for j in range(i+1,a-1):
        for z in range(j+1, a):
            if card[i]+card[j]+card[z]<=b:
                li.append(card[i]+card[j]+card[z])
print(max(li))
