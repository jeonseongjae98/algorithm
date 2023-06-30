# 테스트 케이스 개수
T = int(input())
for tc in range(1,T+1):
    arr = [list(map(int,input().split())) for _ in range(9)]
    result = 1

    for i in range(9):
        # 숫자에 해당하는 idx에 1 추가
        # 요소에 숫자가 2이상인 것이 있으면 스도쿠 X
        
        # 가로 검사
        lst_h = [0] * 10
        # 세로 검사
        lst_v = [0]*10
        for j in range(9):
            # 가로검사
            lst_h[arr[i][j]] += 1
            if lst_h[arr[i][j]] != 1:
                result = 0
                break
            # 세로 검사
            lst_v[arr[j][i]] += 1
            if lst_v[arr[j][i]] != 1:
                result = 0
                break

    # 3*3 검사
    # x,y 3*3스도쿠 검사의 시작점
    for x in range(0,9,3):
        for y in range(0,9,3):
            # 3*3 검사
            lst_3 = [0] * 10
            for i in range(3):
                for j in range(3):
                    lst_3[arr[x+i][y+j]] += 1
                    if lst_3[arr[x+i][y+j]] != 1:
                        result = 0
                        break

    print(f'#{tc} {result}')