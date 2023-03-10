cards = list(range(1, 21))

for i in range(10):
    start, end = map(int, input().split())
    # Reverse the list of cards from start to end
    cards[start-1:end] = cards[start-1:end][::-1]

print(*cards)