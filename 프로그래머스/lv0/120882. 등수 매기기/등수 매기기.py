def solution(score):
    answer = []
    rank = []
    for i in score:
        a = 0
        for j in i:
            a += j
        answer.append(a)
    a = sorted(answer, reverse = True)

    for i in answer:
        rank.append(a.index(i)+1)
    
    return rank