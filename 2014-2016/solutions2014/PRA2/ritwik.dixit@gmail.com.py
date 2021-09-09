#Submitted by Ritwik Dixit

n = int(input())



def findFibonacci(inputint):
    
    count = 3
    fiboMinus = 1
    fibo = 2
    storedFibo = fibo

    if (inputint <= 3 or inputint > 100):
        return "wrong input too high/low"

    while (count < inputint):
        fibo =  fibo + fiboMinus
        fiboMinus = storedFibo
        storedFibo = fibo
        count = count + 1
        

    return fibo

print(findFibonacci(n))
