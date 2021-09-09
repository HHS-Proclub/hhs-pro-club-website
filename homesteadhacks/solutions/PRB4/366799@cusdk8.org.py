#this program lets you input four numbers, then outputs whether those numbers are even or odd
a=int(input(''))
for i in range(a): 
	b=int(input(''))
	if(b % 2 == 0):
		print("EVEN")
	if (b % 2 != 0):
		print("ODD")