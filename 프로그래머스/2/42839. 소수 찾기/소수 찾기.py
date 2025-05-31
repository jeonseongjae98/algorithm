from itertools import permutations

def checkprime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

        

def solution(numbers):
    answer = []
    numbers = list(numbers)
    temp = []
    
    for i in range(1, len(numbers)+1):
        temp += list(permutations(numbers, i))
    num = [int(''.join(t)) for t in temp]
    
    for i in num:
        if checkprime(i):
            answer.append(i)
            
    return len(set(answer))