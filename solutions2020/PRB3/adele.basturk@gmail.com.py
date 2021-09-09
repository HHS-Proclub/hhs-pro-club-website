#
#Challenge#5
#
def create_unique_digits(number):
	digits = list(number)
	sorted_digits = sorted(digits)
	unique_digits = []
	for i in range(len(sorted_digits)):
		if len(unique_digits) == 0:
			unique_digits.append(sorted_digits[i])
		else:
			if unique_digits[-1] != sorted_digits[i]:
				unique_digits.append(sorted_digits[i])
	return unique_digits

			
			

def number_count(number):
	digits = list(number)
	unique_digits = create_unique_digits(number)
	for i in reversed(range(len(digits))):
		current_digit = digits[i]
		for j in range(len(unique_digits)):
			if unique_digits[j] == current_digit:
				if j < len(unique_digits) - 1:
					digits[i] = unique_digits[j+1]
					print(''.join(digits))
					return
				else:
					digits[i] = unique_digits[0]
					break
	digits.insert(0, unique_digits[0])
	print(''.join(digits))
	return
	
	
num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	number = fields[0]
	number_count(number)
	
	
	
	