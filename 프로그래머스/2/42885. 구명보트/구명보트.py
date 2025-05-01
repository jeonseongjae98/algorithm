from collections import deque

def solution(people, limit):
    people = deque(sorted(people))
    answer = 0

    while people:
        if len(people) > 1 and people[0] + people[-1] <= limit:
            people.popleft()
            people.pop()
        else:
            people.pop()
        answer += 1

    return answer
