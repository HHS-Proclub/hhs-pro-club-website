x = int(input())
ans = []
for i in range(x):
	j = int(input())
	cpairs = []
	for _ in range(j):
		coordinates = list(map(int, input().split()))
		cpairs.append([coordinates[0]] + [sum(coordinates)])
	cpairs = sorted(cpairs)
	t = []
	for l in cpairs:
		t.append(sorted(l))
	n = list(map(list,set(map(tuple,t))))
	if (len(t) != len(n)):
		ans.append("YES")
	else:
		ans.append("NO")
for i in ans:
	print(i)
