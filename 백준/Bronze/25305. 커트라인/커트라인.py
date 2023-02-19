a , b = map(int, input().split())
score = list(map(int, input().split()))

score.sort(reverse = True)
print(score[b-1])