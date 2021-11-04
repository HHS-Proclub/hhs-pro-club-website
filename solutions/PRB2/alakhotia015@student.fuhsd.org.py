x = int(input())
vowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]
l = []
for i in range(x):
	p1 = input()
	p2 = input()
	p3 = input()
	count1 = 0
	count2 = 0
	count3 = 0
	for i in p1:
		if i in vowels:
			count1 += 1
	for i in p2:
		if i in vowels:
			count2 += 1
	for i in p3:
		if i in vowels:
			count3 += 1
	if count1 == 5 and count2 ==7 and count3 == 5:
		l.append("YES")
	else:
		l.append("NO")
for i in l:
	print(i)