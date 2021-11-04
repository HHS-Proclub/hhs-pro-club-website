def gcd(a, b):
	return a if not b else gcd(b, a%b)


x = int(input())
l = []
for i in range(x):
	a = int(input())
	l.append(a)
tt = []
for a in l:
	b = sum(list(map(int, list(str(a)))))
	while(gcd(a, b) <= 1):
		a += 1
		b = sum(list(map(int, list(str(a)))))
	tt.append(a)

for i in tt:
	print(i)
