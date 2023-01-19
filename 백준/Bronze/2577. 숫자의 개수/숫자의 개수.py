a = int(input())
b = int(input())
c = int(input())
result = [0 for i in range(10)]

d = list(str(a * b * c))
for i in d:
    result[int(i)] += 1
for i in result:
    print(i)