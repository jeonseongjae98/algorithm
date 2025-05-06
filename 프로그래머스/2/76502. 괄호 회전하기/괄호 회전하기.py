from collections import deque

def solution(s):
    answer = 0
    que = deque(s)
    
    for _ in range(len(que)):
        stack = []
        flag = True
        for el in que:
            if el in '({[':
                stack.append(el)
            else:
                if not stack:
                    flag = False
                    break
                top = stack.pop()
                if (top == '(' and el != ')') or \
                   (top == '{' and el != '}') or \
                   (top == '[' and el != ']'):
                    flag = False
                    break
        # 모든 문자 처리 후 최종 검사
        if flag and not stack:
            answer += 1
        que.append(que.popleft())
    return answer
