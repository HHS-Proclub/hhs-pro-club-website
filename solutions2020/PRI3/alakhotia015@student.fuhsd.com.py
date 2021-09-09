a = int(input())
f = []
for i in range(a):
	a = int(input())
	b = (list(map(int, input().split())))
	b.sort(reverse=True)
	f.append(b)
for val in f:
	r = 0
	for i in range(len(val)):
		r += (val[i]*i) + 1
	print(r)