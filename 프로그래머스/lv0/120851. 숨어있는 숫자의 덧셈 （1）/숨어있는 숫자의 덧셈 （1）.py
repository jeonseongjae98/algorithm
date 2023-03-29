def solution(my_string):
    answer = 0
    for i in my_string:
        if i == '1' or i == '2' or i == '3' or i == '4' or i == '5' or i == '6' or i == '7' or i == '8' or i == '9':
            answer += int(i)
        
    return answer