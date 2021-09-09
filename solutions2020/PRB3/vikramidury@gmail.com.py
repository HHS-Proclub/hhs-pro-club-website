def find_divisors (num):
    for i in range (0, num):
        if (num % (i+1) == 0):
            print (i+1)

n = int(input())
for i in range (n):
    find_divisors(int(input()))
    

            