# this algorithm searches for the bed with the smallest number of 
# pillows on the right and then left of Roybeal. 
# once this bed has been found, pillows our added to each bed going towards Roybeal
# this approach should have the complexity of O(k)

from math import sqrt
# debugging function
do_log = False

def print_log(x):
	if do_log:
		print(x)

		
def pillows_for_Roybeal(n, k, p):

	if n == 1:
		return k
		
	# safeguard against bad input	
	if k <= n:
		return 1

	if p < 1 or p > n:
		return 1

	#distance = int(sqrt(k)) - 1
	#print_log(distance)
	
	m = min(p - 1, n - p)
	M = max(p - 1, n - p)
	k -= n
	M1 =(m+1)*(m+1)
	M2 = (m*(m+1) + M*(M+1))/2 + (M-m)*m + (M+1)
	#print("Boundaries", M1, int(M2))
	
	if k <= (m+1)*(m+1):
		print_log("Case1")
		return int(sqrt(k)) + 1
		
	elif 2*k <= (m*(m+1) + M*(M+1)) + 2*((M-m)*m + (M+1)):
		print_log("Case2")
		a = 1
		b = 2*m + 1
		c = -(m + 1)*m - 2*k
		x = (-b + sqrt(b*b - 4*a*c))/(2*a)
		return int(x) + 1
		
	else:
		print_log("Case3")
		x = (k + (m*(m+1) + M*(M+1))/2)/(m+M+1)
		return int(x) + 1

num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	n = int(fields[0])
	k = int(fields[1])
	p = int(fields[2])
	print(pillows_for_Roybeal(n, k, p))