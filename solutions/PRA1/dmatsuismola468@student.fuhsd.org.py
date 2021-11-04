#!/usr/bin/env python
# coding: utf-8

# In[1]:


import math
x = int(input()) #number of cases
f = 0 #number x 
dig = 0 #number S(x)
gc = 0  #gcd of x, S(x)
g = 0  #variable used to calculate S(x)
ar = []
for i in range(x):
    gc = 1
    f = int(input())
    while gc == 1:
        dig = 0
        g = str(f)
        for i in range(0, len(g)):
            dig += int(g[i])
        gc = math.gcd(f, dig)
        if gc > 1:
            ar.append(f)
        else:
            f += 1
for i in ar:
    print(i)
    


# In[ ]:




