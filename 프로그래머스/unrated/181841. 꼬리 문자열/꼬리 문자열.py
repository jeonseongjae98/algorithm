def solution(str_list, ex):
    answer = ''
    for i in str_list:
        if not ex in i:
            answer += i
    return answer