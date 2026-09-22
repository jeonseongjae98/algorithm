def solution(s):
    answer = True
    stack = []
    for i in s:
        if i == "(":
            stack.append(i)
        else:
            if stack==[]:
                return False
            else:
                stack.pop()
                
    if stack==[]:
        return True
    else:
        return False
    