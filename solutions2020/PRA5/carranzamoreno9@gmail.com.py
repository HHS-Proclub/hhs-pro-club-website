#Andres Carranza
#Advanced challenge problem 5
#11-21-18
import math
from decimal import Decimal
def numSame(exp,top,btm):
  rep = 0
  max = 0
  hold = math.floor(Decimal(top)**Decimal(.5))
  rt = 3
  exps = 1
  while hold >= 2:
    if hold - math.floor(top**(1/rt) ) == 1:
      x  = int( math.log(top)/math.log(hold))
      max+= x-1
      max-=numSame(x-1,hold,hold-1)
      hold-=1
      rt = x+1
    else:
      xp = math.floor(top**(1/rt))
      max+= exps*(hold-xp)
      max-= numSame(exps,hold,xp) 
      hold = math.floor(top**(1/rt))
      rt+=1
      exps+=1
  max+=1
 
  min = 0
  hold = math.floor(Decimal(btm)**Decimal(.5))
  rt = 3
  exps = 1
  while hold >= 2:
    if hold - math.floor(btm**(1/rt) ) == 1:
      x  = int( math.log(btm)/math.log(hold))
      min+= x-1
      min-=numSame(x-1,hold,hold-1)
      hold-=1
      rt = x+1
    else:
      xp = math.floor(btm**(1/rt))
      min+= exps*(hold-xp)
      min-= numSame(exps,hold,xp)
      hold = math.floor(btm**(1/rt))
      rt+=1
      exps+=1
  min+=1
 
  rep = max-min
  return rep*exp
 
 
num = int(input())
ans = []
for z in range(0,num):
  strnum = input()
  lstnum = strnum.split()
  i = int(lstnum[0])
  n = int(lstnum[1])
  i-=1
 
  max = 0
  hold = math.floor(Decimal(Decimal(n)**Decimal(.5)))
  rt = 3
  exps = 1
  while hold >= 2:
    if hold - math.floor(n**(1/rt)) == 1:
      x  = int(math.log(n)/math.log(hold))
      max+= x-1
      max-= numSame(x-1,hold,hold-1)
      hold-=1
      rt = x+1
    else:
      xp = math.floor(n**(1/rt))
      max+= exps*(hold-xp)
      max-= numSame(exps,hold,xp) 
      hold = math.floor(n**(1/rt))
      rt+=1
      exps+=1
  max+=1
 
  min = 0
  hold = math.floor(Decimal(Decimal(i)**Decimal(.5)))
  rt = 3
  exps = 1
  while hold >= 2:
    if hold - math.floor(i**(1/rt) ) == 1:
      x  = int( math.log(i)/math.log(hold))
      min+= x-1
      min-= numSame(x-1,hold,hold-1)
      hold-=1
      rt = x+1
    else:
      xp = math.floor(i**(1/rt))
      min+= exps*(hold-xp)
      min-= numSame(exps,hold,xp) 
      hold = math.floor(i**(1/rt))
      rt+=1
      exps+=1
  min+=1
 
  if min == 1:
    ans.append(max)
  else:
    ans.append(max-min)
  if i == 1:
    ans[z]+=1
for y in ans:
  print(y)