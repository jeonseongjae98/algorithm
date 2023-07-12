def solution(myString):
    answer = []
    li = myString.split("x")
    for i in li:
        answer.append(len(i))
    return answer