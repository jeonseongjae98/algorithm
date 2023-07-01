def solution(s):
    answer = []
    for i in s.split(' '):
        if i != 'Z':
            answer.append(int(i))
        else:
            answer.pop()
    return sum(answer)