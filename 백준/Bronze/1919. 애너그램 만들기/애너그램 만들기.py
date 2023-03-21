s1 = input()
s2 = input()
ans = 0
a, b = [0]*26, [0]*26

for i in range(len(s1)):
    a[ord(s1[i])-97] += 1
for i in range(len(s2)):
    b[ord(s2[i])-97] += 1
for i in range(len(a)):
    ans += abs(a[i] - b[i])
print(ans)
