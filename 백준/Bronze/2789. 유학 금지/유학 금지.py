word = list(input())
words = 'CAMBRIDGE'
a = ""
for i in range(len(word)):
    if word[i] in words:
        word[i] = ''
for i in word:
    print(i, end='')