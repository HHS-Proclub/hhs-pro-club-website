


def find_typos(typo_list):
	consonant_count = 0 
	#typo_list.reverse()
	typo_free = list()
	last_consonant = ''
	
	for i in range(len(typo_list)):
		
		if typo_list[i] in ('a' , 'e' , 'i' , 'o' , 'u' , ' '):
			consonant_count = 0
			last_consonant = ''
		else: 
			consonant_count += 1
			if typo_list[i] == last_consonant:
				pass
			else:
				last_consonant = typo_list[i]
				
				if consonant_count >= 3:
					typo_free.append(' ')
					consonant_count = 1
					
		typo_free.append(typo_list[i])
		
	return typo_free
	
def main(typo_list):
	typo_free_1 = find_typos(typo_list)
	
	typo_free_1.reverse()
	
	typo_free_2 = find_typos(typo_free_1)
	
	typo_free_2.reverse()
	
	return ''.join(typo_free_2)		

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	typo_list = list(fields[0])
	print(main(typo_list))