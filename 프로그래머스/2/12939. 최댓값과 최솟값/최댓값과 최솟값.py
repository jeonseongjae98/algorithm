def solution(s):
    answer = ''
    l = list(map(int, s.split()))
    ma = max(l)
    mi = min(l)
    answer = str(mi) + " " + str(ma)
    return answer