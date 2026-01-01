def solution(s):
    answer = ''
    s = s.split(' ')
    s = list(map(int, s))
    answer+= str(min(s))
    answer+= " "
    answer+= str(max(s))
    
    return answer