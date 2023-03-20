def solution(numbers):
    sum = 0
    for i in numbers:
        sum += i
    answer = sum / len(numbers)
    return answer