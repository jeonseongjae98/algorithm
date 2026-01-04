def solution(s):
    s = s.split(' ')
    answer = []
    for i in range(len(s)):
        s[i] = s[i][:1].upper() + s[i][1:].lower()
    
    answer = ' '.join(s)
    return answer