T = int(input())
sum = 0
while T > 0:
    sum+=T%10
    T//=10
print(sum)