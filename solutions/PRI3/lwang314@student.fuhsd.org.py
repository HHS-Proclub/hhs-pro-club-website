import fileinput
import math
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)

x=0
while x < len(inputs):
    n = int(inputs[x])
    if x+1:
        flats = inputs[x+1].split(" ")
    needToTurnOff = []
    
    i=0
    c=0
    while i < len(flats):
        if i+1 < len(flats) and i-1 >= 0:
            if int(flats[i+1]) == 1 and int(flats[i-1]) == 1 and int(flats[i]) == 0:
                if i+3 < len(flats) and int(flats[i+2]) == 0 and int(flats[i+3]) == 1:
                    if i+1 not in needToTurnOff and i-1 not in needToTurnOff:
                        needToTurnOff.append(i+1)
                elif i+1 not in needToTurnOff and i-1 not in needToTurnOff:
                    needToTurnOff.append(i+1)
        i+=1
    print(len(needToTurnOff))
    x+=2