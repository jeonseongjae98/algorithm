def solution(n):
    answer = 0
    cnt = 0
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i % j == 0:
                cnt += 1
        if cnt >= 3:
            answer += 1
        cnt = 0
    return answer