def solution(clothes):
    answer = 1
    
    closet={}
    for kind, ty in clothes:
        if ty not in closet.keys():
            closet[ty] = [kind]
        else:
            closet[ty].append([kind])
    
    for key, value in closet.items():
        answer *= (len(value)+1)
    
    return answer -1