def solution(my_string, index_list):
    res=''
    for i in index_list: 
        res+=my_string[i]
    return res