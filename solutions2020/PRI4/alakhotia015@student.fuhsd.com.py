def getIt(da, n):
	def flatten(L):
		for item in L:
			try:
				yield from flatten(item)
			except TypeError:
				yield item
	total = 0
	for i in range(len(da)):
		if i + 1 not in list(flatten(n)):
			total += da[i]
			da[i] = -1

	def inL(a, b):
		for v in a:
			if v in b:
				return True
		return False
	def reDup(seq):
		seen = set()
		seen_add = seen.add
		return [x for x in seq if not (x in seen or seen_add(x))]
	r = {}
	for values in da:
		if values == -1:
			continue
		z = n.copy()
		holdlist = [values]
		i = 0
		while i < len(n):
			if inL(holdlist, z[i]):
				holdlist.append(z[i])
				holdlist = list(flatten(holdlist))
				z[i] = [-1, -1]
				i = 0
			else:
				i += 1
		r[values] = reDup(holdlist)
	for key, val in r.items():
		r[key].remove(key)
	r = { k : v for k, v in r.items() if v}
	blist = []
	nlist = []
	zlist = []
	for key, val in r.items():
		blist = []
		if key not in zlist:
			blist.append(key)
			blist.append(val)
			blist = list(flatten(blist))
			zlist.append(blist)
			zlist = list(flatten(zlist))
			nlist.append(blist)
		else:
			continue
	for l in nlist:
		q = []
		for v in l:
			q.append(da[v-1])
		total += min(q)
	print(total)
	
num = int(input())

fin = []
for i in range(num):
	x, y = list(map(int, input().split()))
	z = list(map(int, input().split()))
	d = []
	for i in range(y):
		r = list(map(int, input().split()))
		d.append(r)
	fin.append([z, d])
for v in fin:
	getIt(v[0], v[1])