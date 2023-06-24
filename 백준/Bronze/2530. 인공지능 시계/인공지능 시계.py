h, m, s = map(int, input().split())
S = int(input())
m += (S // 60)
s += (S % 60)


if s >= 60:
    m += (s // 60)
    s = (s % 60)
if m >= 60:
    h += (m // 60)
    m = (m % 60)
if h >= 24:
    h %= 24
print(h, m, s)