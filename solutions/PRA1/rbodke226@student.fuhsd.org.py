import math
t=int(input())
for i in range(t):
    n=int(input())
    while True:
        digitsum=0
        for i in range(len(str(n))):
            digitsum+=int(str(n)[i])
        if math.gcd(digitsum,n)>1:
            print(n)
            break
        n+=1
    
