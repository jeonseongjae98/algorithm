def solution(num_list, n):
    answer = []
    cnt = 0
    for i in num_list:
        answer.append(i)
        cnt += 1
        if cnt == n:
            break
    return answer