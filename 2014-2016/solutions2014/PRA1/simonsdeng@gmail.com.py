def gcd(a, b):
	if a > b:
		a, b = b, a

	if a == 0:
		return b

	return gcd(a, b % a)

n = gcd(int(input(), 16), int(input(), 16))
print(n)
print(hex(n)[2:].upper().zfill(4))
