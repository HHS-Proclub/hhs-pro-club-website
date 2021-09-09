def multiply(a, b):
	return a*b

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	a = int(fields[0])
	b = int(fields[1])
	print(multiply(a,b))
	