from collections import deque
			
# To find the minimum number of deletions,
# we delete one digit at a time and store resulting digit lists
# on a queue (First-In First-Out). We then check the top of
# the queue for divisibility by 3 and repeat the process
# until the first number divisible by 3 is found.
# Case of leading 0 is dealt implicitly by removing only the first
# 0 digit at a time. This guarantees that the elements on the 
# queue are ordered by length, so we always find the minimum
# number of digit deletions first. 

#breadth_first traversal of a tree

def count_deletions(digits):
	new_d = list(digits)
	queue = deque([new_d])

	while len(queue) > 0:
		# Read first element in the queue
		d = queue.popleft()
		#print(d)
		
		# Case of leading 0
		if int(d[0]) == 0:
			d.pop(0)
			if len(d) > 0:
				queue.append(d)
			continue

		# Check if divisible by 3				
		n = int(''.join(d))
		if n % 3 == 0:
			# The number of skipped digits is the difference in length
			return len(digits) - len(d)

		# Single digit non-divisible by 3. Skip.
		if len(d) == 1:
			continue
			
		# More than one digit. Remove first digit and add to the queue	
		for i in range(len(d)):
			new_d = list(d)
			new_d.pop(i)
			queue.append(new_d)
	
	return -1


num_cases = int(input())

for i in range(num_cases):
	number = list(input())
	print(count_deletions(number))