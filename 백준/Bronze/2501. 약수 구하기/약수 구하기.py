N, K = map(int, input().split())

result = 0

for i in range(1, N + 1):
    if N % i == 0:
        K -= 1
        if K == 0:
            result = i
            break

print(result)