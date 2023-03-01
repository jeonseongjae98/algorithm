a = int(input())
for i in range(1, a+1):
    print(' ' * (a-i) + '*' * ((2*i)-1))
for j in range(a-1, 0, -1):
    print(' ' * (a-j) + '*' * ((2*j) -1))