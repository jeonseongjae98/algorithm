def solution(spell, dic):
    for d in dic:
        if set(spell) == set(d):
            return 1
    return 2