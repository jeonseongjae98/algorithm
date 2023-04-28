def solution(balls, share):
    answer = 1
    answer1 = 1
    for i in range(share, 0, -1):
        answer *= i
    for j in range(balls, balls-share, -1):
        answer1 *= j
    return answer1/answer