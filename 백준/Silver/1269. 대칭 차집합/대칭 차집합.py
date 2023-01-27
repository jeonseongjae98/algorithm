a, b = map(int, input().split())
a = set(map(int, input().split()))
b = set(map(int, input().split()))
ab = a - b
ba = b - a
print(len(ab | ba))