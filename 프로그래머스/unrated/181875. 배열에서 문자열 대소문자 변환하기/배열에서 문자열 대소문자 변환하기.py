def solution(strArr):
    answer = []
    cnt = 1
    for i in strArr:
        if cnt % 2 == 1:
            answer.append(i.lower())
        else:
            answer.append(i.upper())
        cnt += 1
    return answer