#!/usr/bin/env python3
#
# jx2zhou
# PRA5.py
# Lattice in a Circle
#
#####

import math

user = list(map(float, input().split(' ')))
point = user[0], user[1]
r = user[2]

def in_circle(test, pos, r):
    """
    Test to check whether a point (tuple: 'test') is in the range of the circle
    defined by radius r and position of radius (tuple: 'pos').
    """
    return distance(test, pos) <= r
    
def distance(p, q):
    p_x, p_y = p
    q_x, q_y = q
    return math.sqrt((p_x - q_x) ** 2 + (p_y - q_y) ** 2)
    
point_count = 0
    
for i in range(int(point[0] - r - 5), int(point[0] + r + 5)):
    for j in range(int(point[1] - r - 5), int(point[1] + r + 5)):
        point_count += int(in_circle((i, j), point, r))

print(point_count)
