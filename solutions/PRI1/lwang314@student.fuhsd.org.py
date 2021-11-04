import fileinput
for x in fileinput.input():
    if x == "":
        break
    if " " in x:
        print(int(x.split(" ")[0]) + int(x.split(" ")[1]))
