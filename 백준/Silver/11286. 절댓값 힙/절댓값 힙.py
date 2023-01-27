import sys
import heapq
T = int(input()) # 테스트 케이스 수
li = []
for _ in range(T):
    a = int(sys.stdin.readline())
    if a != 0:
        heapq.heappush(li, (abs(a), a))
    else:
        if li:
            print(heapq.heappop(li)[1])
        else:
            print(0)

