# -*- coding: utf-8 -*-
"""
Created on Mon Sep 18 19:06:07 2017

@author: Dante
"""

def iterateThroughRects (width, height):
    for x in range(width):
        for y in range(height):
            for dX in range(x, width):
                for dY in range(y, height):
                    yield (x, y, dX, dY)

def iterateThroughRect (A, x0, y0, x1, y1):
    for x in range(x0, x1 + 1):
        for y in range(y0, y1 + 1):
            yield A[x][y]

def timeout ():
    while True:
        pass

for i in range(int(input())):
    r, c, n, k = map(int, input().split(' '))
    students = []
    
    for j in range(n):
        students.append(tuple(map(int, input().split(' '))))
        
    positions = [[False for y in range(c)] for x in range(r)]
    
    for s in students:
        positions[s[0] - 1][s[1] - 1] = True
        
    num = 0
    
    for r in iterateThroughRects(r, c):
        count = 0
        
        for pos in iterateThroughRect(positions, *r):
            if pos:
                count += 1
                
        if count == k:
            num += 1
            
    print(num)