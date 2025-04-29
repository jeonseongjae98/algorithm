def solution(s):
    answer = []
    s = s.split(" ")
    for w in s:
        if w:
            answer.append(w[0].upper()+w[1:].lower())
        else:
            answer.append(w)
    return " ".join(answer)