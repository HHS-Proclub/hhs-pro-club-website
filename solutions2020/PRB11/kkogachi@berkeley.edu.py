import math
h, theta = map(int, input().split())
theta = math.radians(theta)
print(int(h*math.cos(theta)*h*math.sin(theta)*0.5))
