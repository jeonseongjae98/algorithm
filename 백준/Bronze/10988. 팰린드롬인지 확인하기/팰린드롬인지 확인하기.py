word = input()
ok = 0
for i in range(0, len(word)):
    if word[i] != word[-(i+1)]:
        ok = 0
        break
    else:
        ok = 1
print(ok)