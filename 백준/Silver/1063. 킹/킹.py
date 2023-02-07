#3
move = {'R': [1, 0], 'L': [-1, 0], 'B': [0, -1], 'T': [0, 1], 'RT': [1, 1], 'LT': [-1, 1], 'RB': [1, -1], 'LB': [-1, -1]}
king, stone, N = input().split()
k = list(map(int, [ord(king[0]) - 64, king[1]]))
s = list(map(int, [ord(stone[0]) - 64, stone[1]]))
for i in range(int(N)):
  m = input()
  x = k[0] + move[m][0]
  y = k[1] + move[m][1]
  if 0 < x <= 8 and 0 < y <= 8:
    if s[0] == x and s[1] == y:
      x1 = s[0] + move[m][0]
      y1 = s[1] + move[m][1]
      if 0 < x1 <= 8 and 0 < y1 <= 8:
        k = [x, y]
        s = [x1, y1]
    else:
      k = [x, y]

print(f'{chr(k[0] + 64)}{k[1]}')
print(f'{chr(s[0] + 64)}{s[1]}')
