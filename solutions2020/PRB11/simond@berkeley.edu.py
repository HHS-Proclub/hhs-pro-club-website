from math import radians, sin, cos
r, d = map(float, input().split())
t = radians(d)
print(int(r * r * sin(t) * cos(t) / 2))
