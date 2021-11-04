#!/usr/bin/env python
# coding: utf-8

# In[3]:


vow = ["a", "e", "i", "o", "u"]
count = 0
filler = "bop"


# In[5]:


for i in range(int(input())):
    count = 0
    for i in str(input()):
        if i in vow:
            count += 1
    if count != 5:
        print("NO")
        filler = str(input())
        filler = str(input())
    else:
        count = 0
        for i in str(input()):
            if i in vow:
                count += 1
        if count != 7:
            print("NO")
            filler = str(input())
        else:
            count = 0
            for i in str(input()):
                if i in vow:
                    count += 1
            if count != 5:
                print("NO")
            else:
                print("YES")
    


# In[ ]:




