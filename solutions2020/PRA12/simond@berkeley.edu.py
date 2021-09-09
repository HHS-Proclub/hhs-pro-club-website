import re

double_letter = re.compile(r"(.)\1")
for _ in range(int(input())):
	s = input()
	possible = True
	while s:
		match = double_letter.search(s)
		if match is None:
			possible = False
			break
		s = s[:match.start()] + s[match.end():]
	print("Possible" if possible else "Impossible")
