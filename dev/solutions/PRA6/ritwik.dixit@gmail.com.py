n = int(input())
looksay1 = 1
looksay2 = 11
looksay3 = 2111    

def findNextLooksay(last):
    
    nums = []
    count = 1
    thisnum = last[0]
    for i in range(1, len(last)):
        if last[i] == last[i - 1]:
            count += 1
        else:
            nums.append(str(count)+""+str(thisnum))
            count = 1
            thisnum = last[i]
            
    nums.append(str(count)+""+str(thisnum))
    
    s = ("".join(nums))[::-1]
    return s

j = 1
num = "1"
while (j < n):
    num = findNextLooksay(num)
    j += 1

print(num)
            
            
        
        
   
    
    
    
