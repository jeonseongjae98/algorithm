def solution(numbers):
    answer = []
    
    for n in numbers:
        binn = list('0' + bin(n)[2:])
        idx = ''.join(binn).rfind('0')
        binn[idx] = '1'
        
        if n % 2 == 1:
            binn[idx+1] = '0'
            
        answer.append(int(''.join(binn), 2))
    return answer