from collections import Counter

for _ in range(3):
	tasks = map(int, input().split())
	winner = 0
	maxCount = 0
	counts = Counter()
	for i in tasks:
		counts[i] += 1
		if counts[i] > maxCount:
			winner = i
			maxCount = counts[i]
	print(winner)
