#!/usr/bin/env python
# coding: utf-8

# In[4]:


count = 0
for i in range(int(input())):
    count = 0
    num = int(input())
    while num > 1:
        if num % 10 == 1:
            num += 10
            num -= 1
            count += 1
        elif num % 10 == 2:
            num += 10
            num = int(num/10)
            count += 1
        elif num % 10 == 0:
            num = int(num/10)
            count += 1
    print(count)


# In[ ]:




