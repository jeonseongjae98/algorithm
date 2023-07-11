def solution(myString, pat):
    answer = []
    for i in myString:
        if i == 'A':
            answer.append('B')
        elif i == 'B':
            answer.append('A')
        else:
            answer.append(i)
        tmp = "".join(answer)
    if pat in tmp:
        return 1
    else:
        return 0
            
        