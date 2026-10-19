import heapq
def solution(scoville, K):
    answer = 0
    mix_scoville = 0
    heapq.heapify(scoville)
    
    while scoville[0]<K:
        if(len(scoville)<2):
            return -1
        mix_scoville = heapq.heappop(scoville) + (heapq.heappop(scoville)*2)
        heapq.heappush(scoville, mix_scoville)
        answer+=1
    return answer