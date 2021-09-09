num = int(input())
l = []
for i in range(num):
	a = int(input())
	b = input()
	l.append(b)
final = []
for val in l:
	f = []
	d = {}
	x = [i for i in val]
	for val in x:
		if val in d:
			d[val] += 1
		else:
			d[val] = 1
	if 'z' in d:
		zero = d['z']
	else:
		zero = 0
	for k, v in d.items():
		if k != 'n':
			d[k] -= zero
	if 'n' in d:
		one = d['n']
	else:
		one = 0
	final.append([one, zero])
x = [[3, 1], [4, 3]]
z = []
for val in final:
	y = []	
	for i in range(2):
		if i == 0:
			for j in range(val[i]):
				y.append(1)
		if i == 1:
			for j in range(val[i]):
				y.append(0)
	z.append(y)
for val in z:
	print(*val)