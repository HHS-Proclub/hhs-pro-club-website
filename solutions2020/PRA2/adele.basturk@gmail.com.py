def trinket_arrangement(current_trinket, new_trinket, num_islands):
	if current_trinket[0] == 0:
		x = 1
	else:
		x = 0
	for y in range(num_islands):
		if new_trinket[y] == current_trinket[x]:
			for i in range(num_islands - 1):
				if current_trinket[x] == 0:
					x = (x + 1) % num_islands
				if new_trinket[y] == 0:
					y = (y + 1) % num_islands
				#print(x, y)
				if current_trinket[x] != new_trinket[y]:
					print("NO")
					return
				y = (y + 1) % num_islands
				x = (x + 1) % num_islands
			print("YES")
			return
	print("NO")
	return	
	
	 
	
			
num_test_cases = int(input())

for j in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	num_islands = int(fields[0])
	current_trinket = []
	new_trinket = []
	# read first island line (1 0 2)
	# split line to n_array
	# for i loop ( num_islands)
	#     convert ith element of n_array to int
	#     append int to current_tricket
	
	# same for second island line
	current_line = input()
	n_array = current_line.split()
	for i in range(num_islands):
		trinket_number = int(n_array[i])
		current_trinket.append(trinket_number)
	current_line = input()
	n_array = current_line.split()	
	for i in range(num_islands):
		new_trinket_number = int(n_array[i])
		new_trinket.append(new_trinket_number)
	trinket_arrangement(current_trinket, new_trinket, num_islands)