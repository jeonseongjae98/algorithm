T = int(input()) # 테스트 케이스 수
for i in range(T):
    N = list(input())
    sum = 0
    for j in N:
        if j == '(':
            sum += 1
        elif j == ')':
            sum -= 1 
        if sum < 0:
            print('NO')
            break
    if sum > 0:
        print('NO')
        
    elif sum ==0:
        print('YES')