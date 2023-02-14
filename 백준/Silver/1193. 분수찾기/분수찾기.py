n = int(input())
end = 0
line = 0
while n > end:
    line += 1
    end += line

diff = end - n

if line % 2 == 0:
    x = line - diff
    y = diff + 1
else:
   x = diff + 1
   y = line - diff

print(f'{x}/{y}')
