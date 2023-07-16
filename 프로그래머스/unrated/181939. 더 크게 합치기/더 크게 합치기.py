def solution(a, b):
    num1 = int(str(a) + str(b))
    num2 = int(str(b) + str(a))
    return max(num1, num2)