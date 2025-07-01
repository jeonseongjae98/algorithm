def solution(k, d):
    answer = 0
    for x in range(0, d+1, k):
        may_y = int((d**2 - x**2)**0.5)
        answer += (may_y // k) + 1
    return answer