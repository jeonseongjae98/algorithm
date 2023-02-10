# 11856 반반
T = int(input())
for i in range(1, T+1):
    a = input()
    se = set()
    for j in range(4):
        se.add(a[j])
    if len(se) == 2:
        print(f"#{i} Yes")
    else:
        print(f"#{i} No")