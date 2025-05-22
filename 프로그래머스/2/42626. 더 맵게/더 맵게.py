import heapq
def solution(scoville, K):
    answer = 0
    mix = 0
    heapq.heapify(scoville)
    
    while scoville[0] < K:
        if len(scoville) < 2:
            return -1
        mix = heapq.heappop(scoville) + heapq.heappop(scoville)*2
        heapq.heappush(scoville, mix)
        answer+=1
    
    return answer