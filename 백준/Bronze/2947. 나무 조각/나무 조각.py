n = list(map(int, input().split(' ')))
nu = [1, 2, 3, 4, 5]
while n != nu:
    for i in range(len(n)-1):
        if n[i] > n[i+1]:
            tmp = n[i]
            n[i] = n[i+1]
            n[i+1] = tmp
            print(' '.join(map(str, n)))