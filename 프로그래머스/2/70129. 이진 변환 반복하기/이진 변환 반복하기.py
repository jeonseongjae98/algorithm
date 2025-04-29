def solution(s):
    answer = []
    cnt=0
    zerocnt=0
    
    while True:
        if s == "1":
            break
        zerocnt+=s.count("0")
        s=s.replace("0", "")
        s=bin(len(s))
        s=s[2:]
        cnt+=1
    answer=[cnt, zerocnt]
    return answer