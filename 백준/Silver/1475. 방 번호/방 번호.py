n = input()  # 숫자 N을 문자열로 입력받음
count = [0] * 10  # 각각의 숫자들이 사용된 횟수를 저장할 리스트를 0으로 초기화

for num in n:
    count[int(num)] += 1  # 각각의 숫자들이 사용된 횟수를 count 리스트에 반영

# 6과 9는 서로 변환이 가능하므로, 두 숫자의 사용 횟수를 합쳐줌
count[9] = (count[6] + count[9] + 1) // 2  
count[6] = 0

# count 리스트에서 가장 큰 값이 필요한 세트의 개수가 됨
answer = max(count)
print(answer)