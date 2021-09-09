def shift(s):
	return s[1:] + s[0]
def numberOfShifts(s, t):
	a = 0
	while s != t:
		s = shift(s)
		a = a + 1
	return a
def isPos(k, l):
	if len(k) != len(l):
		return False
	t = len(k) + 1
	for _ in range(t):
		k = shift(k)
		if k == l:
			return True
	return False

def isPossible(l):
	o = l[0]
	for i in l:
		if not isPos(i, o):
			return False
	return True


x = int(input())
n = []
for i in range(x):
	numberOfLines = int(input())
	t = []
	for j in range(numberOfLines):
		q = input()
		t.append(q)
	n.append(t)
totalCounts = []

for l in n:
	if len(l) == 1 or len(l) == 0:
		totalCounts.append(-1)
		continue

	if not isPossible(l):
		totalCounts.append(-1)
		continue

	t = 0
	res = []
	for val in l:
		nif = 0
		for q in l:
			nif += numberOfShifts(q, val)
		res.append(nif)
	totalCounts.append(min(res))
for inps in totalCounts:
	print(inps)