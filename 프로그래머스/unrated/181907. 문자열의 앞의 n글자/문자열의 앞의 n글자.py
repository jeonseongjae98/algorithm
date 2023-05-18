def solution(my_string, n):
    cnt = 0
    li = []
    for i in my_string:
        if cnt == n:
            break
        cnt += 1
        li.append(i)
        
    a = ''.join(li)
    return a