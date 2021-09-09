class PRB1:
    x = int(input())
    
    for i in range(1, x+1):
        n = int(input())
        start = 1
        final = 0
        while(True):
			final += start
			
			if(final > n):
				print(start-1)
				break
			
			start += 1