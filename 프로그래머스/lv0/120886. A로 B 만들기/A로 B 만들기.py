def solution(before, after):
    a = sorted(before)
    b = sorted(after)
    if a == b:
        return 1
    else:
        return 0