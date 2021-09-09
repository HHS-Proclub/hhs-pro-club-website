x = int(input())
z = []
for i in range(x):
	a = input()
	S = input()
	T = input()
	z.append([S, T])
asd = []
for l in z:
	x = l[0]
	t = l[1]
	if not "*" in x:
		if x == t:
			asd.append("YES")
			continue
		else:
			asd.append("NO")
			continue
		continue
	if x[-1] == "*":
		fft = len(x)
		roar = t[fft-1:]
		x = x.replace("*", roar)
		if x == t:
			asd.append("YES")
		else:
			asd.append("NO")
		continue

	i = x.index("*")
	n = t[i:]
	r = len(x) - i
	n = n[:-r+1]
	x = x.replace("*", n)
	if x == t:
		asd.append("YES")
	else:
		asd.append("NO")
for i in asd:
	print(i)
