x = int(input())
z = {}
for i in range(x):
	a = input()
	b = int(input())
	c = (list(map(int, input().split())))
	z[b] = c
lis = []
for key, val in z.items():
	f = [int(x) for x in str(key)]
	z = f.copy()
	r = f.copy()
	start = None
	for i in range(len(f)):
		if f[i] < val[f[i]-1]:
			start = i
			break
	if start == None:
		start = 0
	end = None
	z = z[start:]
	for i in range(len(z)):
		if z[i] > val[z[i]-1]:
			end = i + start
			break
	r = r[start:end]
	for i in range(len(r)):
		r[i] = val[r[i]-1]
	f[start:end] = r
	last = "".join(map(str, f))
	lis.append(int(last))
for x in lis:
	print(x)


