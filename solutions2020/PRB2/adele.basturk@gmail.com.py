is_debug = False
class Position:
	def __init__(self, x_value, y_value):
		self.x_value = x_value
		self.y_value = y_value

def picture_arrangement(r, c, n, k, g):
	total_count = 0
	for p_y in range(1, r + 1):
		for p_x in range(1, c + 1):
			if p_y*p_x < k:
				continue
			if is_debug:
				print("Trying pic size = ", p_x, p_y)
			count = picture_count(r, c, n, k, g, p_x, p_y)
			total_count += count
	return total_count

	
def picture_count(r, c, n, k, g, p_x, p_y):
	total_p_count = 0
	for y in range(r + 1 - p_y):
		for x in range(c + 1 - p_x):
			if has_k_students(x, y, p_x, p_y, g, k) == True:
				total_p_count +=1
				if is_debug:
					print("Pic# = ", total_p_count)
	return total_p_count

				
def has_k_students(x0, y0, p_x, p_y, g, k):
	if is_debug:
		print("Has student", x0, y0, p_x, p_y, k)
	total_s_count = 0
	for y in range(y0, y0 + p_y):
		for x in range(x0, x0 + p_x):
			if is_debug:
				print("testing ", x, y, g[x][y])
			if g[x][y] == 1:
				if is_debug:
					print("found student", x, y)
				total_s_count +=1
				if total_s_count >= k:
					return True
	
	return False
					
		
	
num_test_cases = int(input())
	

for j in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	r = int(fields[0])
	c = int(fields[1])
	n = int(fields[2])
	k = int(fields[3])
	#print(r, c)
	g = [[0] * r for i in range(c)]
	#g = [[0] * 20 for i in range(20)]
	
	for i in range(n):
		current_line = input()
		positions_params = current_line.split()
		y_value = int(positions_params[0])
		x_value = int(positions_params[1])
		#if (x_value > 0 and x_value <= c and y_value > 0 and y_value <= r):
		#print(x_value, y_value)
		g[x_value-1][y_value-1]  = 1
	print(picture_arrangement(r, c, n, k, g))
	
