grades = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'D0']
T = int(input()) # 테스트 케이스 수
for i in range(T):
    a, b = map(int, input().split())
    li = []
    for z in range(1, a+1):
        c, d, e = list(map(int, input().split()))
        g = c * 0.35 + d * 0.45 + e * 0.2
        li.append((g, z))
    
    li.sort(reverse=True)

    for j in range(a):
        if li[j][1] == b:
            print(f'#{i+1}', grades[(j // (a//10)) % 10])
            break