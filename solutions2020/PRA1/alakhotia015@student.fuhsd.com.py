num = int(input())
nums = []
def special(n):
	n = [*map(int, str(n))]
	a = 0
	b = 0
	c = 0
	for i in range(len(n)):
		if i < len(n)-2:
			if n[i] == 1 and n[i + 1] == 4 and n[i+2] == 4:
				c += 1
				continue
		if i < len(n)-1:
			if n[i] == 1 and n[i+1] == 4:
				b += 1
				continue
		if n[i] == 1:
			a += 1
	if (a + (b*2) + (c*3)) == len(n):
		return True
	else:
		return False
for i in range(num):
	nums.append(int(input()))
for val in nums:
	if special(val):
		print("YES")
	else:
		print("NO")


