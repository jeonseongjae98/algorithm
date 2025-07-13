def solution(k, ranges):
    answer = []
    num = [k]
    while k != 1:
        if k%2 ==0:
            k//=2
            num.append(k)
        else:
            k = k*3 +1
            num.append(k)
            
    prefix = [0]*(len(num)+1)
    for i in range(2, len(num)+1):
        prefix[i] = prefix[i-1] + (num[i-2] + num[i-1])/2
    for i in ranges:
        a, b = i[0]+1, len(num)+i[1]
        if a>b:
            answer.append(-1.0)
        else:
            answer.append(prefix[b]-prefix[a])
    return answer