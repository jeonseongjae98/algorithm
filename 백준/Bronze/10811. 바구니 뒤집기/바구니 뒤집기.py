n, m = map(int, input().split())  # 바구니의 개수 n과 바구니를 뒤집는 횟수 m을 입력받는다.
baskets = list(range(1, n+1))    # 1부터 n까지의 번호가 적힌 바구니들을 만든다.

for _ in range(m):
    i, j = map(int, input().split())
    baskets[i-1 : j] = reversed(baskets[i-1 : j])

print(*baskets)