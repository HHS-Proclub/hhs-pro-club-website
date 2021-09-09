q = int(input())
for _ in range(q):
	x, n, d = map(int, input().split())
	assignments = {}
	for s in range(1, n + 1):
		assignments[s] = tuple(map(int, input().split()))

	if sum([i for i, a in assignments.values()]) < d:
		print(-1)

	knapsack = [[0] * (len(assignments) + 1)]
	for y in range(1, x + 1):
		knapsack.append([0])
		for s in range(1, n + 1):
			i, a = assignments[s]
			if y < a:
				knapsack[y].append(knapsack[y][s - 1])
			else:
				knapsack[y].append(max(knapsack[y][s - 1], knapsack[y - a][s - 1] + i))
		if knapsack[y][n] >= d:
			print(x - y)
			break
