from collections import Counter
def solution(str1, str2):
    answer = 0
    str1=str1.lower()
    str2=str2.lower()
    str1lst = []
    str2lst = []
    for i in range(len(str1)-1):
        if str1[i].isalpha() and str1[i+1].isalpha():
            str1lst.append(str1[i]+str1[i+1])
    for i in range(len(str2)-1):
        if str2[i].isalpha() and str2[i+1].isalpha():
            str2lst.append(str2[i]+str2[i+1])
    Counter1 = Counter(str1lst)
    Counter2 = Counter(str2lst)
    
    inter = list((Counter1 & Counter2).elements())
    union = list((Counter1 | Counter2).elements())
    
    
    if len(union)==0 and len(inter)==0:
        return 65536
    else:
        return int((len(inter)/len(union)) * 65536)
    
    return answer