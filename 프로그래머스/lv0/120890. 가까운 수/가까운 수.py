def solution(array, n):
    answer = []
    array.sort()
    for i in array:
        answer.append(abs(i - n))
        
    return array[answer.index(min(answer))]