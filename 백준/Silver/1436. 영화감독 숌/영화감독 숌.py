a= int(input())
b = 666
cnt = 0
while True:
    if '666' in str(b):
        cnt += 1
        if cnt == a:
            print(b)
            break
    b += 1