import fractions

a = int(input(), 16)
b = int(input(), 16)

gcd = fractions.gcd(a, b)
print(gcd)
print('%04x' % gcd)
