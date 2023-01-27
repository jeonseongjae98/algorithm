import sys
input = sys.stdin.readline

A = list(map(int, input().split()))
A.sort()
print(A[1])