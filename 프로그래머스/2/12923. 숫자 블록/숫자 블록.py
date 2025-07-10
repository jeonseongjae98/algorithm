def solution(begin, end):
    answer = []
    for i in range(begin, end+1):
        answer.append(maxblock(i))
    return answer

def maxblock(n):
    tmp = [1]
    if n ==1:
        return 0
    for i in range(2, int(n**0.5)+1):
        if n%i == 0 and i <= 10**7:
            tmp.append(i)
            if n//i <= 10**7 and n//i != n:
                tmp.append(n//i)
    return max(tmp)