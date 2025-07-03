def solution(board):
    answer = 1
    board = list(list(i) for i in board)
    ocount, xcount = 0, 0
    ofinish, xfinish = 0, 0
    for i in range(3):
        for j in range(3):
            if board[i][j] == 'O':
                ocount+=1
            if board[i][j] == 'X':
                xcount+=1
    for i in range(3):
        if board[i].count('O')==3 or board[0][i] == board[1][i] == board[2][i] == 'O':
            ofinish += 1
        if board[i].count('X')==3 or board[0][i] == board[1][i] == board[2][i] == 'X':
            xfinish += 1
    if board[0][0] == board[1][1] == board[2][2] == 'O' or board[0][2] == board[1][1] == board[2][0] == 'O':
        ofinish += 1
    if board[0][0] == board[1][1] == board[2][2] == 'X' or board[0][2] == board[1][1] == board[2][0] == 'X':
        xfinish += 1
    
    if ocount < xcount or ocount > xcount+1:
        return 0
    if xfinish != 0 and ofinish != 0:
        return 0
    if xfinish != 0 and ocount!=xcount or ofinish != 0 and (ocount == xcount):
        return 0
    
    return answer