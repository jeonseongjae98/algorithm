def solution(my_string):
    li = []
    answer = my_string.lower()
    for i in answer:
        li.append(i)
    li.sort()
    a = ''.join(li)
    return a