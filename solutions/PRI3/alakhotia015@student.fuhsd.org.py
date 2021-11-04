x = int(input())
t = []
for _ in range(x):
	n = int(input())
	f = list(map(int, input().split()))
	s = 0
	for i in range(len(f)):
		if (i == 0 or i == len(f)-1):
			continue
		if(f[i-1] == 1 and f[i+1] == 1 and f[i] == 0):
			f[i+1] = 0
			s += 1
	t.append(s)
for asd in t:
	print(asd)