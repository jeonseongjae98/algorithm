def solution(k, tangerine):
    answer = 0
    dic = {}
    for i in tangerine:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    sortdic = sorted(dic.items(), key=lambda item:item[1], reverse=True)
    for _, i in sortdic:
        k -= i
        answer+=1
        if k <= 0:
            break
    return answer