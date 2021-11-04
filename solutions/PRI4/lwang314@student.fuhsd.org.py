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
    n = int(inputs[x])
    
    i=1
    camels = []
    while i <= n:
        camel = inputs[x+i].replace('\n','').split(" ")
        camels.append(camel)
        i+=1
    spit = "NO"
    for o in camels:
        pos = int(o[0]) + int(o[1])
        for y in camels:
            if int(y[0]) == pos:
                if int(y[0]) + int(y[1]) == int(o[0]):
                    spit = "YES"
    print(spit)
    x+=(n+1)