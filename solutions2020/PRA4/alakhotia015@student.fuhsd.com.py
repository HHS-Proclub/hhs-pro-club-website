def getDrifts(coordinates):
	note = len(coordinates) - 1
	x = []
	y = []
	for v in coordinates:
		x.append(v[0])
		y.append(v[1])

	xd = {}
	yd = {}
	for values in x:
		if values in xd:
			xd[values] += 1
		else:
			xd[values] = 1
	for values in y:
		if values in yd:
			yd[values] += 1
		else:
			yd[values] = 1
	for key, val in xd.items():
		if val > 1:
			note -= 1
	for key, val in yd.items():
		if val > 1:
			note -= 1
	print(note)

x = int(input())
z = []
for i in range(x):
	r = []
	d = int(input())
	for j in range(d):
		v = list(map(int, input().split()))
		r.append(v)
	z.append(r)
for values in z:
	getDrifts(values)
