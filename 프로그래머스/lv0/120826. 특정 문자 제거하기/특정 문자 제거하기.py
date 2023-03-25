def solution(my_string, letter):
    li = []
    for i in my_string:
        if i != letter:
            li.append(i)
    return ''.join(li)
            
