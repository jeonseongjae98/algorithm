def solution(n):
    answer = ''
    array = ['1', '2', '4']
    while n > 0:
        n -= 1
        answer = array[(n)%3] + answer
        n //= 3
    return answer
