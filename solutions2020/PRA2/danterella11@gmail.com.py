# -*- coding: utf-8 -*-
"""
Created on Mon Sep 18 22:20:18 2017

@author: Dante
"""

def shift (l):
    return l[1:] + [l[0]]

for i in range(int(input())):
    n = int(input())
    starting = list(map(int, input().split(' ')))
    target = list(map(int, input().split(' ')))
    
    starting.remove(0)
    target.remove(0)
    
    while starting[0] != target[0]:
        target = shift(target)
    
    if starting == target:
        print('YES')
    else:
        print('NO')