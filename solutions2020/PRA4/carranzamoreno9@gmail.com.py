import math
def getFactors(n):
  up = int(math.sqrt(n))

  factors = []
  for i in range (1,up+1):
    if n%i == 0:
      factors.append(i)
      if i != n//i:
        factors.append(n//i)
  factors.sort()
  return factors
  

n = int(input())
answers = []

for j  in range(0,n):
  yes = False
  i = int(input())
  loto = input()
  if int(loto) == 0 and len(loto) > 1:
    answers.append(True)
  else:
    i-= loto.count('0',0,len(loto))
    loto = loto.replace('0','')
    digits = []

    for ii in loto:
      digits.append(int(ii))
    digitsSum = 0
    for ii in digits:
      digitsSum+=ii
  
    factors = getFactors(digitsSum)
    fractions = []
    ii = 0
    while ii < len(factors):
      fractions.append(0)
      for iii in range(0,i):
        fractions[len(fractions)-1] = digits[iii]+fractions[len(fractions)-1]
        if (fractions[len(fractions)-1] == factors[ii]) and (iii!= i-1):
          fractions.append(0)
      yes = True
      for check in fractions:
        if fractions[0] != check or len(fractions) < 2:
          yes = False
      if yes:
        ii = len(factors)
      else:
        del(fractions)
        fractions = []

      ii+=1
    
    if yes:
      answers.append(True)
    else:
	    answers.append(False)
		   
for i in answers:
  if i:
    print("YES")
  else:
    print("NO")