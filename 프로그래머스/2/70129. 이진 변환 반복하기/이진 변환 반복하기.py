def solution(s):
    cnt0 = 0
    cnt = 0
    while(s != "1"):
        cnt+=1
        cnt0 += s.count('0')
        s = s.replace('0', '')
        s = bin(len(s))[2:]
        
    return [cnt, cnt0]