castles = int(input())
x = []
for i in range(castles):
	a = input()
	b = (list(map(int, input().split())))
	x.append(b)
def switch(castle):
	switch = 0
	for i in range(len(castle)):
		if i != 0 and i != len(castle)-1:
			if castle[i] == 0 and castle[i+1] == 1 and castle[i-1] == 1:
				castle[i+1] = 0
				switch += 1
	return switch
for c in x:
	print(switch(c))



