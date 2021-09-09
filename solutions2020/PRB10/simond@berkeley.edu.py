def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

n, d = map(int, input().split("/"))
g = gcd(d, n)
print(str(n // g) + "/" + str(d // g))
