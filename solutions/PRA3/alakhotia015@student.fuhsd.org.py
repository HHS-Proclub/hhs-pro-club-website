from itertools import combinations
x = int(input())
asdfasdf = []
for _ in range(x):
	n, k = map(int, input().split())
	c = []
	for i in range(n):
		asd = list(map(int, input().split()))
		c.append(asd)
	t = []
	for i in range(1, k + 1):
		t += list(combinations(c, i))
	asdf = []
	for combo in t:
		s = [i[0] for i in combo]
		f = [i[1] for i in combo]
		asdf.append(sum(s) * min(f))
	asdfasdf.append(max(asdf))
for i in asdfasdf:
	print(i)


