a= int(input())
for i in range(a, 3, -1):
    if all([j == '4' or j == '7' for j in str(i)]):
        print(i)
        break