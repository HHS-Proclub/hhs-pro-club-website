import fileinput
import math
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)
for x in inputs:
    x = x.replace('\n','')
    c = 0
    ran = False
    while x != "1":
        if x.endswith("0"):
            x = x[:-1]
        elif x.endswith("1"):
            ran = True
            i = len(x)-1
            count = 0
            while i > 0:
                if x[i] == "1":
                    x = x[:-1]
                    count += 1
                elif x[i] == "0":
                    x = x[:-1]
                    x += "10"
                    i=0
                elif x=="":
                    x += "10"
                    i=0
                i -= 1
            if count > 0:
                for i in range(count-1):
                    x += "0"
        c += 1
    if ran:
        print(c+2)
    else:
        print(c)
                    