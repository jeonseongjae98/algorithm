def solution(s):
    answer = ''
    l = list(map(int, s.split()))
    maxn = max(l)
    minn = min(l)
    return str(minn)+" "+str(maxn)