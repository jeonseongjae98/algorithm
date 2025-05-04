def solution(elements):
    answer = set()
    elementslen = len(elements)
    elements = elements * 2
    
    for i in range(elementslen):
        for j in range(elementslen):
            answer.add(sum(elements[j:j+i+1]))
    return len(answer)