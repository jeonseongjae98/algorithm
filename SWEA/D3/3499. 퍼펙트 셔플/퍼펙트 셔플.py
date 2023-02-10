# 퍼펙트 셔플
T = int(input())
for t in range(1, T+1):
    a = int(input())
    b= list(input().split())
    li = []
    li1 = []
    result = []
    if a % 2 == 0:
        for i in range(a//2):
            li.append(b[i])
        for j in range(a//2, a):
            li1.append(b[j])
        for k in range(a//2):
            result.append(li[k])
            result.append(li1[k])
        print('#{}'.format(t), end =' ')
        print(*result)
    else:
        for i in range((a//2) + 1):
            li.append(b[i])
        for j in range((a//2) + 1, a):
            li1.append(b[j])
        for k in range(a//2):
            result.append(li[k])
            result.append(li1[k])
        result.append(li[a//2])
        print('#{}'.format(t), end =' ')
        print(*result)
