def check(place):
    for i in range(0, 5):
        for j in range(0, 5):
            if place[i][j] == 'O':
                cnt = 0
                if i-1 >= 0:
                    if place[i-1][j] == 'P':
                        cnt+=1
                if j-1 >= 0:
                    if place[i][j-1] == 'P':
                        cnt+=1
                if j+1 <= 4:
                    if place[i][j+1] == 'P':
                        cnt+=1   
                if i+1 <= 4:
                    if place[i+1][j] == 'P':
                        cnt+=1
                        
                if cnt >= 2:
                    return 0
                
            if place[i][j] == 'P':
                if i-1 >= 0:
                    if place[i-1][j] == 'P':
                        return 0
                if j-1 >= 0:
                    if place[i][j-1] == 'P':
                        return 0
                if j+1 <= 4:
                    if place[i][j+1] == 'P':
                        return 0  
                if i+1 <= 4:
                    if place[i+1][j] == 'P':
                        return 0
    return 1
            

def solution(places):
    answer = []
    for i in range(0, len(places)):
        answer.append(check(places[i]))
    return answer