def solution(msg):
    
    dic = {chr(i+65):i+1 for i in range(26)}
    
    answer = []
    
    while True:
        if msg in dic:
            answer.append(dic[msg])
            break
        for i in range(1, len(msg)):
            if msg[:i+1] not in dic:
                answer.append(dic[msg[:i]])
                dic[msg[:i+1]] = len(dic)+1
                msg = msg[i:]
                break
    return answer