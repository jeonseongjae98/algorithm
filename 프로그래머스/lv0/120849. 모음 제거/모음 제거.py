def solution(my_string):
    li = []
    for i in my_string:
        if i not in ('a', 'e', 'i', 'o', 'u'):
            li.append(i)
    return ''.join(li)