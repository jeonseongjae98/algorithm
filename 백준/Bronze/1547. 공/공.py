a= int(input())
li = [1, 0, 0]
for i in range(a):
    b, c = map(int, input().split())
    li[b-1], li[c-1] = li[c-1], li[b-1]
print(li.index(1)+1)
