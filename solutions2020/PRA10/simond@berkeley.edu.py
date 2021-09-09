for _ in range(int(input())):
	count = 0
	L, R = map(int, input().split())
	for i in range(max(L, 2), R + 1):
		if str(i) == str(i)[::-1]:
			if all(i % d != 0 for d in range(2, int(i**0.5) + 1)):
				count += 1
	print(count)
