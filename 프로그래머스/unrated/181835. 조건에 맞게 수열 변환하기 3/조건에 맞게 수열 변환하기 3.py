def solution(arr, k):
    answer = []
    if k % 2 == 0:
        for i in arr:
            answer.append(i + k)
    else:
        for i in arr:
            answer.append(i * k)
    return answer