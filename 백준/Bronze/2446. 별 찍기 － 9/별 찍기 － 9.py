num = int(input())
for i in range(1, num + 1):
    print(' ' * (i - 1) + '*' * ((2 * (num - i)) + 1))
for j in range(1, num):
    print(' ' * (num - j -1) + '*' * ((2 * j) + 1))