x = int(input())
tt = []
for i in range(x):
	a, b = map(int, input().split())
	tt.append(a+b)

for i in tt:
	print(i)