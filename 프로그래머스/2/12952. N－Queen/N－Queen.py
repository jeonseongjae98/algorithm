def solution(n):
    answer = dfs([0]*n, 0, n)
    return answer

def dfs(board, row, n):
    count = 0
    if n == row:
        return 1
    for col in range(n):
        board[row] = col
        for i in range(row):
            if board[i] == board[row]:
                break
            if abs(board[i]-board[row]) == row - i:
                break
        else:
                count+=dfs(board,row+1,n)
    return count