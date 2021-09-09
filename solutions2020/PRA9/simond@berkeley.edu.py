for _ in range(int(input())):
    notes = [0] * 7
    bars = map(int, input().split())
    for b in bars:
        notes[(b - 1) % 7] = 1
    print(sum(notes))
