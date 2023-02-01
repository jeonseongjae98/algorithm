a= int(input())
for i in range(a):
    score = list(map(int, input().split()))
    score.pop(score.index(max(score)))
    score.pop(score.index(min(score)))
    if max(score) - min(score) >= 4:
        print('KIN')
    else:
        print(sum(score))