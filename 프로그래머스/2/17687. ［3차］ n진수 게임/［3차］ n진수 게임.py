def convert_n(n, base):
    temp="0123456789ABCDEF"
    q,r = divmod(n, base)
    if q == 0:
        return temp[r]
    else:
        return convert_n(q, base) + temp[r]
def solution(n, t, m, p):
    answer = ''
    num = 0
    while True:  
        answer+=convert_n(num, n)
        if len(answer)>=t*m:
            answer = answer[:t*m]
            return answer[p-1:t*m:m]
        num+=1