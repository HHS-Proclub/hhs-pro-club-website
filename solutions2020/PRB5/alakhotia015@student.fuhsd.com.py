x = int(input())
z = []
for i in range(x):
	word = input()
	unique = int(input())
	z.append([word, unique])
ans = []
for l in z:
	w = l[0]
	u = l[1]
	if len(w) < u:
		ans.append("impossible")
		continue
	uiw = len(set(w))
	if uiw > u:
		ans.append(0)
		continue
	ans.append(u-uiw)
for x in ans:
	print(x)
