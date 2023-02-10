for t in range(1, 11):
    a = int(input())
    b = list(map(int, input().split()))
    for i in range(a):
        b[b.index(max(b))] =  max(b) - 1
        b[b.index(min(b))] =  min(b) + 1
    result = max(b) - min(b)
    print('#{}'.format(t), end =' ')
    print(result)