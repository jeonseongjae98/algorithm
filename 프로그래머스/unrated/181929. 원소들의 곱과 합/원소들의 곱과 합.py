def solution(num_list):
    answer = 1
    a = (sum(num_list))**2
    for i in num_list:
        answer *= i
    if a > answer:
        return 1
    else:
        return 0
    