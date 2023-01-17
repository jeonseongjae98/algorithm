X = []
Y = []
for i in range(3):
    x, y = map(int, input().split())
    X.append(x)
    Y.append(y)

for i in range(3):
    if X.count(X[i]) == 1:
        X1 = X[i]
    if Y.count(Y[i]) == 1:
        Y1 = Y[i]
print(X1, Y1)
