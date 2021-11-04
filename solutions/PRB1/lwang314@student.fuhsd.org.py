import fileinput
for x in fileinput.input():
    print(int(x)+1)
