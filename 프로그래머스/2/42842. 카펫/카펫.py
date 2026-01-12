def solution(brown, yellow):
    answer = []
    yx = 0
    yy = 0
    
    for i in range(1, int(yellow**0.5)+1):
        if yellow % i == 0:
            yx = yellow // i
            yy = i
            if 2*yx + 2*yy + 4 == brown:
                answer.append(yx+2)
                answer.append(yy+2)
                break
    
    answer.sort(reverse = True)
            
    return answer