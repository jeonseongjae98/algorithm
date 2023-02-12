def  solve(n):
    cnt = 0
    for i in range(1, n+1):
        if i < 100:
            cnt += 1
        elif (int(str(i)[2]) - int(str(i)[1]) == int(str(i)[1]) - int(str(i)[0])):
                cnt += 1
    return cnt
n = int(input())
print(solve(n))