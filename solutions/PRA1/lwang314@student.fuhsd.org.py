import math
import fileinput
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)
for n in inputs:
    a = 0
    while True:
        x = 0
        i = int(n)+a
        for j in str(i):
            x += int(j)
        if math.gcd(x, i) > 1:
            print(int(i))
            break
        a+=1
