import sys
n = int(input())

numbers = list(map(int, sys.stdin.readline().rstrip().split()))

so = sorted(set(numbers))

numdict = {}
for i in range(len(so)):
    numdict[so[i]] = i

for i in numbers:
    print(numdict[i], end=' ')