def solution(brown, yellow):
    for i in range(1, yellow+1):
        if yellow % i == 0:
            yellow_row = int(yellow/i)
            yellow_col = i
            if(2*(yellow_row+yellow_col)+4==brown):
                return [yellow_row+2, yellow_col+2]