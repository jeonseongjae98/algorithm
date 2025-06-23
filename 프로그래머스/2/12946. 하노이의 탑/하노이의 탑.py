def solution(n):
    answer = []
    hanoi(n,1, 3, 2, answer)
    return answer

def hanoi(n, start, end, middle, result):
    if n == 1:
        result.append([start, end])
        return None
    hanoi(n-1, start, middle, end, result)
    result.append([start, end])
    hanoi(n-1, middle, end, start, result)
    