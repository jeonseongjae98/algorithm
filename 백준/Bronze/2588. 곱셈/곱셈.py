A = int(input())
B = int(input())
B1 = B
for i in range(3):
  print(A * (B % 10))
  B //= 10

print(A * B1)
