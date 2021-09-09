x = int(input())
t = []
for i in range(x):
	inp = list(map(int, input().split()))
	t.append(inp)
r = []
for v in t:
	a = v[0]
	b = v[1]
	n = 0
	while b != a:
		if b < a:
			b += 1
			n += 1
			continue
		if b % 2 == 0:
			b = b / 2
			n += 1
			continue
		if b % 2 == 1:
			b = b + 1
			n += 1
			continue
	r.append(n)
for x in r:
	print(x)







