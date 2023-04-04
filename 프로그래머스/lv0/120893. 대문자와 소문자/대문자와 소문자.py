def solution(my_string):
    answer = []
    for i in my_string:
        if ord(i) < 97:
            answer.append(i.lower())
        else:
            answer.append(i.upper())
    return ''.join(answer)