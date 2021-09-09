def getCuts(x, dollars):
	odds = 0
	evens = 0
	cuts = 0
	price = 0
	tot = []
	for i in range(len(x)):
		if x[i] % 2 == 0:
			evens += 1
		else:
			odds += 1
		if odds == evens and odds > 0 and i != len(x)-1:
			cuts += 1
			odds = 0
			evens = 0
			price = abs(x[i]-x[i+1])
			tot.append(price)
	tot.sort()
	while dollars < sum(tot):
		tot = tot[:-1]
	cuts = len(tot)
	return cuts

num = int(input())
a = []
for i in range(num):
	b = list(map(int, input().split()))[1]
	c = list(map(int, input().split()))
	a.append([c, b])
for i in range(len(a)):
	print(getCuts(a[i][0], a[i][1]))


