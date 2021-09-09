n, d = map(int, input().split('/'))

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

g = gcd(n, d)
print(str(n//g) + '/' + str(d//g))
