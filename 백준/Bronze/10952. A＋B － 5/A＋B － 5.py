while True:
    x, y = list(map(int, input().split()))
    if x == 0 and y == 0:
        break
    print(x + y)
