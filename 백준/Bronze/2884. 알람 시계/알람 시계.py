a, b = map(int, input().split())
if b >= 45:
    b -= 45

elif b < 45:
    a -= 1
    b = b + 15
    if a < 0:
        a = 23
    
print(a, b) 