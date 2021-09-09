# -*- coding: utf-8 -*-
"""
Created on Thu Sep 14 22:43:24 2017

@author: Dante
"""

import numpy as np
 
def test (a, b, r):
    N = len(a)
    M = np.zeros((N,N))
    for i in range(N):
        for j in range(N):
            if i != j:
                M[i,j] = a[i]
            else:
                M[i,j] = a[i] - r
    
    Mi = np.linalg.inv(M)
   
    k = np.dot(Mi, b)
   
    rems = []
    for i in range(len(k)):
        if k[i] < 0:
            rems.append(i)
    for index in reversed(rems):
        a.pop(index)
        b.pop(index)
   
    if len(rems) == 0:
        return np.sum(k)
    else:
        return test(a, b, r)

def doRandomTest ():
    import random
    
    n = random.randint(1, 10000)
    b = [random.randint(1, 1000) for i in range(n)]
    a = [random.randint(1, 1000) for i in range(n)]
    
    r = random.randint(1, sum(a) - 1)
    
    print('%.10f' % test(a, b, r))
    
def doTest ():
    trials = int(input())
    for i in range(trials):
        n, r = map(float, input().split(' '))
        a, b = [], []
        for j in range(int(n)):
            line = input().split(' ')
            a.append(int(line[0]))
            b.append(int(line[1]))
        print('%.10f' % test(a, b, r))

doTest()
