T = int(input()) # 테스트 케이스 수
a = []
for i in range(T):
    a.append(int(input()))
a = sorted(a)

for j in a:
    print(j)