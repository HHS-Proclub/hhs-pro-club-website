def count_zeros(number):
	zero_counter = 0
	for i in range(len(number)):
		if number[i] == '0':
			zero_counter += 1
	return zero_counter
			

def round_n(number, num_zeros):

	if num_zeros == 0:
		return number
	if int(number) == 0:
		return number
		
	while True:
	
		zeros = count_zeros(number)
		
		if zeros == num_zeros:
			return number
			
		flag = False
			
	
		for i in reversed(range(len(number))):
			if int(number[i]) != 0 and number[i] == '2':
				number = str(int(number) * 5)
				flag = True
				break
			elif number[i] == '5':
				number = str(int(number) * 2)
				flag = True 
				break
			elif number[i] == '4' or number[i] == '6' or number[i] == '8':
				number = str(int(number) * 5)
				flag = True
				break
				
				
		if not flag:
			number = str(int(number) * 10)
			
		
			
		

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	number = str(fields[0])
	num_zeros = int(fields[1])
	print(round_n(number, num_zeros))
	