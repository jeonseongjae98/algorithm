import  heapq
import sys
input = sys.stdin.readline
heap = []
T = int(input())
for _ in range(T):
    n = int(input())
    if n != 0:
        heapq.heappush(heap, n)
    else:
        if heap:
            print(heapq.heappop(heap))
        else:
            print(0)