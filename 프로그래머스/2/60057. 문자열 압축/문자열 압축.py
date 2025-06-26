def solution(s):
    answer = []
    if len(s) == 1:
        return 1
    for i in range(1, len(s)+1):
        b = ''
        cnt = 1
        tmp = s[:i]
        for j in range(i,len(s)+i,i):
            if tmp == s[j:i+j]:
                cnt+=1
            else:
                if cnt != 1:
                    b += str(cnt)+tmp    
                else:
                    b += tmp
                tmp = s[j:j+i]
                cnt = 1
        answer.append(len(b))
    return min(answer)