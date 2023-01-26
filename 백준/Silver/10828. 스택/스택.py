import sys
stack = []

for i in range(int(sys.stdin.readline())):
    N = sys.stdin.readline().split()
    if N[0] == 'push':
        stack.append(int(N[1]))
    elif N[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif N[0] == 'size':
        print(len(stack))
    elif N[0] == 'top':
        if len(stack) != 0:
            print(stack[-1])
        else:
            print(-1)
    elif N[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)