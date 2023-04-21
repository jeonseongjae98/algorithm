def solution(i, j, k):
    answer = 0
    for z in range(i, j+1):
        if str(k) in str(z):
            answer += str(z).count(str(k))
    return answer