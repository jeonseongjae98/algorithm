for t in range(1, 11):
    N = int(input())
    arr = input()
    li = []
    result = 1

    for i in range(N):
        if arr[i] == '(' or arr[i] == '{' or arr[i] == '[' or arr[i] == '<':
            li.append(arr[i])
        
        if arr[i] == ')':
            if len(li) > 0 and li.pop() != '(':
                result = 0
                break
        if arr[i] == '}':
            if len(li) > 0 and li.pop() != '{':
                result = 0
                break
        if arr[i] == ']':
            if len(li) > 0 and li.pop() != '[':
                result = 0
                break
        if arr[i] == '>':
            if len(li) > 0 and li.pop() != '<':
                result = 0
                break

    print(f'#{t}', result)