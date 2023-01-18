T = int(input()) # 테스트 케이스 수
result = ''
for i in range(T):
    x, y = input().split()
    for j in range(len(y)):
        result +=  y[j]*int(x)
    print(result)
    result = ''