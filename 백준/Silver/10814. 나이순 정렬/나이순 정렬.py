import sys
n = int(sys.stdin.readline())
members = []
for i in range(n):
    members.append(list(sys.stdin.readline().split()))
members.sort(key=lambda x: int(x[0]))
for member in members:
    print(member[0], member[1])