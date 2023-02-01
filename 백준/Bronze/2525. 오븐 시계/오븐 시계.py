a, b = map(int, input().split())
c = int(input())
b += c
if b >= 60:
    a += (b // 60)
    b %= 60
    if a >= 24:
        a %= 24
print(a, b)