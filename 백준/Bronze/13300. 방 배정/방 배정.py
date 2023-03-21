n, k = map(int, input().split())

# 각 학년과 성별별로 학생 수를 저장하는 딕셔너리
students = {'M': [0] * 7, 'F': [0] * 7}
room_count = 0

for i in range(n):
    s, y = map(int, input().split())
    if s == 1:
        students['M'][y] += 1
    else:
        students['F'][y] += 1
    
for j in ['M', 'F']:
    for z in range(1, 7):
        room_count += students[j][z] // k
        if students[j][z] % k != 0:
            room_count += 1
print(room_count)