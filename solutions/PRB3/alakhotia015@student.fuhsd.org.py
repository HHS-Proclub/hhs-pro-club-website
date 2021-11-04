x = int(input())
goldval = []

def flatten_list(data):
	return [item for sublist in data for item in sublist]
for i in range(x):
	n, m = map(int, input().split())
	gold = list(map(int, input().split()))
	gold = [0] + gold
	maps = {}
	gs = []
	for mn in range(m):
		t = list(map(int, input().split()))
		gs.append(t)
	t = []
	gs = sorted(gs)
	for i in gs:
		c = i
		for j in gs:
			if(not set(c).isdisjoint(j)):
				c = c + j
		t.append(list(set(c)))
	t = list(map(list,set(map(tuple,t))))
	n = []
	for i in t:
		c = i
		for j in t:
			if(not set(c).isdisjoint(j)):
				c = c + j
		n.append(list(set(c)))
	n = list(map(list,set(map(tuple,n))))
	goldsm = []
	for friendlist in n:
		nt = []
		for ind in friendlist:
			nt.append(gold[ind])
			gold[ind] = 0
		goldsm.append(min(nt))
	goldmin = sum(gold) + sum(goldsm)
	goldval.append(goldmin)
for i in goldval:
	print(i)
