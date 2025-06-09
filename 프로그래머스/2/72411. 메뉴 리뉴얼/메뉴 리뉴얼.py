from itertools import combinations
from collections import Counter

def solution(orders, course):
    answer = []
    for c in course:
        temp = []
        for order in orders:
            cbn = combinations(sorted(order), c)
            temp += cbn
        counter = Counter(temp)
        if len(counter) != 0 and max(counter.values()) >= 2:
            for i in counter:
                if counter[i] == max(counter.values()):
                    answer += [''.join(i)]
    return sorted(answer)