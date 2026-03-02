def solution(clothes):
    answer = 1
    closet = {}
    for n, k in clothes:
        if k in closet.keys():
            closet[k] += [n]
        else:
            closet[k] = [n]
            
    for key, value in closet.items():
        answer *= (len(value)+1)
        
    return answer -1