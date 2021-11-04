import fileinput
import math
import numpy as np
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)

x=0
while x < len(inputs):
    n = int(inputs[x].split(" ")[0])
    k = int(inputs[x].split(" ")[1])
    
    i=0
    b0 = np.array([])
    t0 = np.array([])
    while i < n:
        b0 = np.append(b0,int(inputs[x+i+1].split(" ")[1].replace('\n','')))
        t0 = np.append(t0,int(inputs[x+i+1].split(" ")[0].replace('\n','')))
        i+=1
    sorting = b0.argsort()
    bArr = b0[sorting[::-1]]
    tArr = t0[sorting[::-1]]
    
    #print(bArr)
    #print(tArr)
    best=0
    i=0
    while i < len(bArr):
        b = int(bArr[i]) #the minimum beauty to be tested
        t = int(tArr[i])
        
        tTotal=0
        times=[]
        #print("Testing beauty " + str(b))
        l=i
        while l >= 0:
            times.append(int(tArr[l]))
            l-=1
        times.sort(reverse=True)
        #print("longest times for beauty")
        #print(times)
        
        j=0
        while j < k and j < len(times):
            #print("picking: "+str(times[j]))
            tTotal+=times[j]
            j+=1
        
        
        #print("Found total " + str(tTotal))
        if tTotal * b > best:
            best = tTotal * b
        
        i+=1
    print(best)
    x+=(n+1)