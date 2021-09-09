x = int(input())
n = []
for i in range(x):
	a = int(input())
	b = int(input())
	c = int(input())
	d = int(input())
	e = int(input())
	f = int(input())
	n.append([a, b, c, d, e, f])

finallist = []
for val in n:
	ties = val[0]
	scarves = val[1]
	vests = val[2]
	jackets = val[3]
	ftype = val[4]
	stype = val[5]
	cost = 0
	if ftype >= stype:
		nom = min(ties, jackets)
		cost += nom * ftype
		jackets = jackets - nom
		ties = ties - nom
		newnom = min(scarves, vests, jackets)
		cost += stype * newnom
	else:
		nom = min(scarves, vests, jackets)
		cost += nom * stype
		jackets = jackets - nom
		newnom = min(ties, jackets)
		cost += newnom * ftype
	finallist.append(cost)
for x in finallist:
	print(x)
