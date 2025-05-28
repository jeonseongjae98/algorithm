def solution(m, n, board):
    answer = 0
    b = [list(x) for x in board]
    tmp = set()
    while True:
        for i in range(m-1):
            for j in range(n-1):
                t= b[i][j]
                if t==[]:
                    continue
                else:
                    if b[i][j+1]==t and b[i+1][j]==t and b[i+1][j+1]==t:
                        tmp.add((i, j))
                        tmp.add((i, j+1))
                        tmp.add((i+1, j))
                        tmp.add((i+1, j+1))
        if tmp:
            answer+=len(tmp)
            for i , j in tmp:
                b[i][j] = []
            tmp = set()
        else:
            break
            
        while True:
            moved=0
            for i in range(m-1):
                for j in range(n):
                    if b[i][j] and b[i+1][j] == []:
                        b[i][j],b[i+1][j] = b[i+1][j],b[i][j]
                        moved = 1
            if moved==0:
                break
                
    
    return answer