T = int(input())
li = []
if T == 1:
    print('')
for i in range(2, T+1):
    while T % i == 0:
        print(i)
        T //= i
