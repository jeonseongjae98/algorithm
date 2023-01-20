T = int(input()) # 테스트 케이스 수
for t in range(1, T+1):
    N = list(input())
    result = ''
    N.reverse()
    for i in N:
        if i == 'b':
            result += 'd'
        elif i == 'd':
            result += 'b'
        elif i == 'p':
            result += 'q'
        else:
            result += 'p'    
    print(f'#{t} {result}')