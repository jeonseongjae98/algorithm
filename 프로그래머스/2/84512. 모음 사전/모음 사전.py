def solution(word):
    answer = 0
    dic = {}
    li = ["A", "E", "I", "O", "U"]
    def dfs(s):
        nonlocal answer
        if len(s) > 5:
            return
        dic[s] = answer
        answer+=1
        for i in li:
            if(len(s+i)>5):
                return
            dfs(s+i)
    dfs("")
    return dic[word]
    
    
    return answer