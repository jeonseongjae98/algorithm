def solution(num_list):
    num = ''
    num1 = ''
    for i in range(len(num_list)):
        if num_list[i] % 2 == 1:
            num += str(num_list[i])
        else:
            num1 += str(num_list[i])
    return int(num) + int(num1)