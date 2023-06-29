n=int(input())

s=list(map(int,input().split()))
s.sort()
print(s[n//2])