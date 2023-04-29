def solution(age):
    answer = []
    for i in str(age):
        if int(i) == 0:
            answer.append('a')
        elif int(i) == 1:
            answer.append('b')
        elif int(i) == 2:
            answer.append('c')
        elif int(i) == 3:
            answer.append('d')
        elif int(i) == 4:
            answer.append('e')
        elif int(i) == 5:
            answer.append('f')
        elif int(i) == 6:
            answer.append('g')
        elif int(i) == 7:
            answer.append('h')
        elif int(i) == 8:
            answer.append('i')
        elif int(i) == 9:
            answer.append('j')   
    return ''.join(answer)