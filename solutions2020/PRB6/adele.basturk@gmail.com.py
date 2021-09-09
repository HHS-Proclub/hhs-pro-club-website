from collections import deque


def find_winner(n, k, po):
	
	win_count = 0
	queue = deque(po)
	current_player = queue.popleft()
	while win_count < k and win_count < n:
		new_player = queue.popleft()
		
		if current_player > new_player:
			queue.append(new_player)
			win_count += 1
	
		else:
			queue.append(current_player)
			current_player = new_player
			win_count = 1
			
	return current_player	
	
num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	n = int(fields[0])
	k = int(fields[1])
	current_line = input()
	powers = current_line.split()
	po = []
	for i in range(n):
		po.append(int(powers[i]))
	
	print(find_winner(n, k, po))