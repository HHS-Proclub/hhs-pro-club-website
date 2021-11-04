import fileinput
import math
import numpy as np
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)

x=0
while x < len(inputs):
    cans = inputs[x+1]
    cans = cans.split(" ")
    cans.sort(reverse=True)
    
    shots = 0
    d = 0
    for i in cans:
        shots += int(i)*d+1
        d+=1
    x+=2
    print(shots)