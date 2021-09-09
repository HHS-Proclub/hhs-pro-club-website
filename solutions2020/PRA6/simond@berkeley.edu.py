syllables = ["pi", "ka", "chu"]
for _ in range(int(input())):
	s = input()
	valid = True
	while s and valid:
		valid = False
		for syllable in syllables:
			if s.startswith(syllable):
				valid = True
				s = s[len(syllable):]
	print("YES" if valid else "NO")
