import fileinput
import math
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)

def test(num, n, k):
    l = num
    c = 1
    while l < n:
        if (math.floor(num / (k**c)) == 0):
            return False
            break
        l += math.floor(num / (k**c))
        c+=1
    return True

for b in inputs:
    n = int(b.split(" ")[0].replace('\n', ''))
    k = int(b.split(" ")[1].replace('\n', ''))
    maximum = n
    minimum = 0
    while True:
        if test(math.floor((maximum+minimum)/2), n, k):
            if test(math.floor((maximum+minimum)/2)-1, n, k) != True:
                print(math.floor((maximum+minimum)/2))
                break
            maximum = math.floor((maximum+minimum)/2)-1
        else:
            minimum = math.floor((maximum+minimum)/2)+1
