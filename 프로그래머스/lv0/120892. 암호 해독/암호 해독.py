def solution(cipher, code):
    answer = []
    cnt =  0
    j = 1
    for i in cipher:
        cnt +=1
        if cnt == code * j:
            j += 1
            answer.append(i)
    
    return ''.join(answer)