n=int(input())
Nums=list(map(int,input().split()))
x=int(input())

Nums.sort()
count=0
left=0
right=n-1

while left!= right:   #좌측 포인트와 우측 포인트가 겹치게 되면 종료
    if Nums[left] + Nums[right] == x:
        count+=1
        left+=1
    elif Nums[left] + Nums[right] > x:
        right-=1
    else:
        left+=1

print(count)