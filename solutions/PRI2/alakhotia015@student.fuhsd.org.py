x = int(input())
t = []
for i in range(x):
	bina = int(str(input()), 2)
	count = 0
	while(bina != 1):
		if(bina % 2 == 0):
			bina = bina // 2
		else:
			bina = bina + 1
		count += 1
	t.append(count)
for i in t:
	print(i)