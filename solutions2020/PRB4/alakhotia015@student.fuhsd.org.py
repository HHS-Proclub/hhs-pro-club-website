numberOfInputs = int(input())
inputs = []
for i in range(numberOfInputs):
	a = input()
	b = list(map(int, input().split()))
	inputs.append(b)
answers = ["NO"] * numberOfInputs
for j, t in enumerate(inputs):
	for i in range(len(t)):
		if t[i] == t[t[t[t[i]-1]-1]-1]:
			answers[j] = "YES"
			break
for values in answers:
	print(values)
	
