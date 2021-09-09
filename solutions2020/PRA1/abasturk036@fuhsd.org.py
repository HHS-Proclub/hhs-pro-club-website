def is_unique(lst):
    if len(lst) > 1:
        return is_unique(lst[1:]) and (lst[0] not in lst[1:])
    return True


	    
def distinct_year(n):
	
	while True:
		
		n += 1
		
		digit_array = [int(x) for x in str(n)]
		
		if is_unique(digit_array):
			return n

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	n = int(fields[0])
	
	print(distinct_year(n))