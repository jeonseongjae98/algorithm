T = int(input()) # 테스트 케이스 수
cnt = 0
for t in range(1, T+1):
    a = input()
    for i in range(len(a)-1):
        if a[i] == a[i+1]:
            pass
        else:
            if a[i] in a[i+1:]:
                cnt -= 1
                break
    cnt += 1
print(cnt)