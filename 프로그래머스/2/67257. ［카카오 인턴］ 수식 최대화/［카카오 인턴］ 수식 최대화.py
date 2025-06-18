from re import split
from itertools import permutations

def solution(expression):
    values = []
    
    for priority in permutations(['*', '+', '-'], 3):
        operands = list(map(int, split('[\*\+\-]',expression)))
        operators = [c for c in expression if c in '*+-']
        
        for op in priority:
            while op in operators:
                i = operators.index(op)
                
                if op == '*':
                    v = operands[i] * operands[i+1]
                elif op == '+':
                    v = operands[i] + operands[i+1]
                else:
                    v = operands[i] - operands[i+1]
                
                operands[i] = v
                operands.pop(i+1)
                operators.pop(i)
        values.append(operands[0])
                
    return max(abs(v) for v in values)