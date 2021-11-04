from math import log, ceil, floor
def getV(n, k):
    p = ceil(log(n)/log(k))

    p1 = n * pow(k, p)
    p2 = 0
    for i in range(p + 1):
        p2 += pow(k, i)
    v = ceil(p1 / p2)
    return v, p
def ev(v, k, p):
	s = 0
	for i in range(p + 1):
		s += floor(v / (k ** i))
	return s
x = int(input())
ansl = []
for i in range(x):
    n, k = list(map(int, (input().split())))
    v, p = getV(n, k)
    eva = ev(v, k, p)
    while(eva < n):
    	v += 1
    	eva = ev(v, k, p)
    ansl.append(v)
for i in ansl:
	print(i)
