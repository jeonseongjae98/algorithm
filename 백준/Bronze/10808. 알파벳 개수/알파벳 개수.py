a = input()
li = [0] * 26
for i in a:
    li[ord(i)-97] += 1
print(*li)
