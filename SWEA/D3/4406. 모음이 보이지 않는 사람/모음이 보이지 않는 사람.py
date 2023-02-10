# 모음이 보이지 않는 사람
vo = ['a','e','i','o','u']
T = int(input())
for i in range(1, T+1):
    a = input()
    li = []
    for j in range(len(a)):
        if a[j] not in vo:
            li.append(a[j])
    a = "".join(li)
    print(f'#{i} {a}')
