def solution(emergency):
    li = []
    a = sorted(emergency, reverse = True)
    for i in emergency:
        li.append(a.index(i)+1)
    return li