from collections import deque

def solution(cacheSize, cities):
    answer = 0
    
    memory = deque()
    cities = [city.lower() for city in cities]

    for i in cities:
        if i in memory:
            answer+=1
            memory.remove(i)
            memory.append(i)
        else:
            answer+=5
            memory.append(i)
            if len(memory) > cacheSize:
                memory.popleft()
    return answer