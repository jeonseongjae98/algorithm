def solution(chicken):
    answer = 0
    while(chicken>=10):
        div = chicken // 10
        mov = chicken % 10
        answer += div
        chicken = div + mov
    return answer