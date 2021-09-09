def find_divisor(n):
	k = 1
	greatest_divisor = 0
	while True:
		divisor = (2**k-1)*(2**(k-1))
		#print((2**k-1),(2**(k-1)), divisor, k)
		
		if divisor > n:
			return greatest_divisor
		
		if n % divisor == 0:
			greatest_divisor = divisor
		
		k += 1
		

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	number = int(fields[0])
	print(find_divisor(number))