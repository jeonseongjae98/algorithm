T = int(input())
for _ in range(T):
    a = input()
    result = 0
    cnt = 1
    for i in range(len(a)):
        if a[i] == 'O':
            result += cnt
            cnt += 1
        else:
            cnt = 1
    print(result)

