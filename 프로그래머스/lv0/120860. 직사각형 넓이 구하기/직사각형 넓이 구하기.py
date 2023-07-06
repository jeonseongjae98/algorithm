def solution(dots):
    x2, y2= max(dots)
    x1, y1= min(dots)

    return (x2-x1)*(y2-y1)