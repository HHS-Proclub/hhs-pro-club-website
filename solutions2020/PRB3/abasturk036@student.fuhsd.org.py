def unscramble(text, length):
	z = 0
	n = 0
	bin = ""
	for i in range(length):
		
		if text[i] == 'z':
			z += 1
		elif text[i] == 'n':
			n += 1

	
	for i in range(n):
		bin += "1 "
	for i in range(z):
		bin += "0 "
		
	return bin
		



num_test_cases = int(input())

for i in range(num_test_cases):
	length = int(input())
	text = input()
	print(unscramble(text, length))