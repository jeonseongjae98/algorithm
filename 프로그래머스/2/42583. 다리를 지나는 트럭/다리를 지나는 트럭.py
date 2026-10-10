from collections import deque
def solution(bridge_length, weight, truck_weights):
    time = 0
    bridge = deque([0] * bridge_length)
    truck_weights = deque(truck_weights)
    
    currentweight = 0
    while len(truck_weights) != 0:
        time+=1
        currentweight -= bridge.popleft()
        
        if currentweight + truck_weights[0] <= weight:
            currentweight += truck_weights[0]
            bridge.append(truck_weights.popleft())
        else:
            bridge.append(0)
    time += bridge_length
    
    return time