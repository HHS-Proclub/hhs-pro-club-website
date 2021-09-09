from math import sqrt

i = int(input())

primes, last = 2, 2
for _ in range(i-1):
    
    #nextprime
    a, loop = last+1, True
    while loop:
        loop = False
        for x in range(2,a):
           # print(a,x,"lodfasdflasdlf")
            if a%x == 0:
                a+=1
                loop = True
                break;
    if a > i:
        break
    primes *= a
    last = a

print(oct(primes)[2:])
