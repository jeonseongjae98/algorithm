def quad(arr, x, y, n):
    for i in range(x, x+n):
        for j in range(y, y+n):
            if (arr[i][j] != arr[x][y]):
                n //= 2
                quad(arr, x, y ,n)
                quad(arr, x+n, y, n)
                quad(arr, x, y+n, n)
                quad(arr, x+n, y+n, n)
                return
    answer[arr[x][y]]+=1

def solution(arr):

    global answer
    answer = [0, 0]
    quad(arr, 0, 0, len(arr))
    return answer