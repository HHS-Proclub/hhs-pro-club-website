s1 = set(list(input()))
s2 = set(list(input()))

ss1 = ''.join(sorted(list(s2.difference(s1))))
ss2 = ''.join(sorted(list(s1.difference(s2))))

print(ss1 if len(ss1) != 0 else "none")
print(ss2 if len(ss2) != 0 else "none")
