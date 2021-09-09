import math

x = int(input())
y = int(input())
stepLength = x+ x/2
steps = math.ceil((y/stepLength)*2)
print(steps)