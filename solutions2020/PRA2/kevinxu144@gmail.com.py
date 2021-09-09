from math import sqrt; from itertools import count, islice

def isPrime(n):
    return n > 1 and all(n%i for i in islice(count(2), int(sqrt(n)-1)))

numtest = input()
output = ""

for i in range(int(numtest)):
    num = int(input())

    if (int(str(num)[0]) % 2 == 0 or int(str(num)[len(str(num))-1]) % 2 == 0 or int(str(num)[len(str(num))-1]) == 5) and len(str(num)) > 1:
        output += "NO\n"
    else:
        if isPrime(num) and isPrime(int(str(num)[::-1])) and num != int(str(num)[::-1]):
            output += "YES\n"
        else:
            output += "NO\n"

print(output[:len(output)-1])
