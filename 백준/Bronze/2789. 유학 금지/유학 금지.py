word = input()
words = 'CAMBRIDGE'
a = ''
for i in word:
    if i not in words:
        a += i

print(a)