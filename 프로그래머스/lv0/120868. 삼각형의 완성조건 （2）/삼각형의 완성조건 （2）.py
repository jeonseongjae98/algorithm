def solution(sides):
    sides.sort()
    return (sides[1] + sides[0]) - (sides[1] - sides[0]) - 1
