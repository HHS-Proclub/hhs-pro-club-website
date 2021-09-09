# Python3 code to check if  
# given number is Emirp or not. 
  
# Returns true if n is prime.  
# Else false. 
def isPrime(n): 
      
    # Corner case 
    if n <= 1: 
        return False
      
    # Check from 2 to n-1 
    for i in range(2, n): 
        if n % i == 0: 
            return False
      
    return True
  
# Function will check whether 
# number is Emirp or not 
def isEmirp(n): 
      
    # Check if n is prime 
    n = int(n) 
    if isPrime(n) == False: 
        return "NO"
        #return
    if n <= 10:
    	return "NO"
    	#return
          
        # Find reverse of n 
    reverse = 0
    while n != 0: 
        d = n % 10
        reverse = reverse * 10 + d 
        n = int(n / 10) 
        if reverse == n:
        	return "NO"
        	#return
          
          
    # If both Original and Reverse  
    # are Prime, then it is an 
    # Emirp number 
    #return isPrime(reverse) 
    
    if isEmirp(n):
    	return "YES"
    	#return 
    	
    else: 
    	return "NO"
    	#return
    
num_test_cases = int(input())

for i in range(num_test_cases):
	current_line = input()
	fields = current_line.split()
	n = int(fields[0])
	
	print(isEmirp(n))
	
	'''if isEmirp(n):
		print("YES") 
    
    else:
    	
    	print("NO")''' 
		
      
      
    