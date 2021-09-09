
def add(a, b):
	sum = a + b
	return sum

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	a = int(fields[0])
	b = int(fields[1])
	
	print(add(a,b))