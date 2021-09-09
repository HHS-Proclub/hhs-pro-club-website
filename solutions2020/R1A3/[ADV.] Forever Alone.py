reading = True
read = []
while reading:
	newest = input()
	if newest != "":
		read.append(newest)
	else:
		reading = False
print(int(read[0])*3)