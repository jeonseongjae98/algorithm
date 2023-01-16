X, Y, Z = map(int,input().split())
if X == Y == Z:
    sum = 10000 + (X * 1000)
elif X == Y or X == Z:
    sum = 1000 + (X * 100)
elif  Y == Z:
    sum = 1000 + (Z * 100)
else:
    sum = max(X,Y,Z) * 100
print(sum)