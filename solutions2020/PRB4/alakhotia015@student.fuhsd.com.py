x = int(input())

z = [3, 2, 1]

def tri(z):
	for i in range(len(z)):
		n = z[i]
		d = z[n-1]
		f = z[d-1]
		l = z[f-1]
		if n == l:
			if n != d and d != f and f != n:
				return "YES"
	return "NO"
r = []
for i in range(x):
	x = input()
	z = list(map(int, input().split()))
	r.append(z)
for v in r:
	print(tri(v))
