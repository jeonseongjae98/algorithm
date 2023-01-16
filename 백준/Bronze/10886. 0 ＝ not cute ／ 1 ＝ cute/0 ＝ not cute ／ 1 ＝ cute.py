T = int(input()) # 테스트 케이스 수
cnt = 0
cnt1 = 0
for t in range(1, T+1):
        A = int(input())
        if A == 0:
            cnt +=1
        else:
            cnt1 +=1
if cnt > cnt1:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")