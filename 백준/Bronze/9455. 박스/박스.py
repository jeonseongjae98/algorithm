for _ in range(int(input())):
    n, m = map(int,input().split())
    box = [input().split() for _ in range(n)]
    a = 0
    for j in range(m):
        cnt = 0
        for i in range(n-1,-1,-1): 
            if box[i][j] == '1':
                a += cnt
            else:
                cnt += 1 
    print(a)