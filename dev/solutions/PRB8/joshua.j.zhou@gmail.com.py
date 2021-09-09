s1 = set(list(input()))
s2 = set(list(input()))

d1 = s2.difference(s1)
d2 = s1.difference(s2)

print(''.join(list(d1)) if len(d1) != 0 else "NONE")
print(''.join(list(d2)) if len(d2) != 0 else "NONE")