num = int(input())
x = []
for i in range(num):
	a, b, c = (list(map(int, input().split())))
	x.append((a - min(b, c))+1)
for val in x:
	print(val)
