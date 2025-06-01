from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = deque([0] * bridge_length)
    truck_w = deque(truck_weights)
    
    current_w = 0
    while len(truck_w) > 0:
        answer+=1
        current_w -= bridge.popleft()
        
        if current_w + truck_w[0] <= weight:
            current_w += truck_w[0]
            bridge.append(truck_w.popleft())
        else:
            bridge.append(0)
    answer += bridge_length
    
    return answer