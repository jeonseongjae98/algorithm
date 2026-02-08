def solution(want, number, discount):
    answer = 0
    
    for i in range(len(discount)-9):
        ok = True
        for j in range(len(want)):
            if discount[i:i+10].count(want[j]) != number[j]:
                ok = False
                break
        if ok:
            answer += 1
                
    return answer