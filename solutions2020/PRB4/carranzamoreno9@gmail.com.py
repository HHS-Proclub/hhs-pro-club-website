def positive(slimes):
  for i in slimes:
    if i > 0:
      return True
  return False

def negative(slimes):
  for i in slimes:
    if i < 0:
      return True
  return False

def zero(slimes):
  if 0 in slimes:
    return True
  return False  

def summm(slimes):
  sm = 0
  for i in slimes:
    sm+= abs(i)
  return sm

def lowest(slimes):
  loww = []
  for i in slimes:
    loww.append(abs(i))
  loww.sort()
  return loww[0]
numYears = int(input())
for n in range(0,numYears):
  numSlimes = int(input())
  slimes = input().split()
  for i in range(0,len(slimes)):
    slimes[i] =  int(slimes[i])
  if len(slimes) == 1:
    print(slimes[0])
    continue
  slimes.sort()
  neg = negative(slimes)
  pos = positive(slimes)
  zer = zero(slimes)
  summ = summm(slimes)
  if neg and pos:
    print(summ)
  elif zer:
    print(summ)
  elif neg:
    print(summ- 2*abs(lowest(slimes)))
  else:
    print(summ - 2*abs(lowest(slimes)))
  

