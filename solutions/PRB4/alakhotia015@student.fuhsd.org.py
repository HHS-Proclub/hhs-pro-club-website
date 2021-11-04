x = int(input())
t = []
for i in range(x):
	x = str(input())
	upper = 0
	lower = 0
	for j in x:
		if(ord(j) < 93):
			upper += 1
		else:
			lower += 1
	if(upper > lower):
		t.append(x.upper())
	else:
		t.append(x.lower())
for j in t:
	print(j)
