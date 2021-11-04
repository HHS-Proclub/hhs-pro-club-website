x = int(input())
ans = []
for i in range(x):
	n = int(input())
	dur = list(map(int, input().split()))
	dur = sorted(dur, reverse = True)
	mins = 0
	for i, j in enumerate(dur):
		mins += i * j + 1
	ans.append(mins)
for i in ans:
	print(i)

