import math
a, b = list(map(int, input().split()))

add = a + b
sub = a - b
mul = a * b
div = a / b

print(add, sub, mul, math.trunc(div), sep='\n')