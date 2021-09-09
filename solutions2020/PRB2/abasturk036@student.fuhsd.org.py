def insomnia(rooms):
	
	count = 0
	
	for i in range(1, len(rooms) - 1):
		if (rooms[i - 1] == 1 and rooms [i + 1] == 1 and rooms[i] == 0):
			rooms[i + 1] = 0
			count += 1
	
	return count

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	num_rooms = int(fields[0])
	room = []
	current_line = input()
	room_array = current_line.split()
	
	for i in range(num_rooms):
		r = int(room_array[i])
		room.append(r)
	#print(room)
	print(insomnia(room))