T = int(input()) # 테스트 케이스 수
z = []
for i in range(T):
    num = int(input())
    if num == 0:
        z.pop()
    else:
        z.append(num)
print(sum(z))