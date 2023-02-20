n = input()
li = []
for i in range(len(n)):
    li.append(int(n[i]))
li.sort(reverse = True)
print(*li, sep = '')
