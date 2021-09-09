iterations = int(input())
for i in range(0,iterations):
  intNums = int(input())
  setNums = [int(x) for x in input().split()]
  even = False
  odd = False
  for j in range(0,len(setNums)):
    if even == True and odd == True:
      break
    elif setNums[j] % 2 == 0:
      even = True
    else:
      odd = True

  largest = max(setNums)
  if odd == True:
    left = largest - len(setNums)
  elif even == True:
    left = (largest/2) - len(setNums)

  redFlag = True
  for k in range(0,len(setNums)):
    for l in range(0,len(setNums)):
      current = setNums[k] - setNums[l]
      if current not in setNums:
        redFlag = False

  if redFlag == True:
    print("Luke")
  else:
    if left % 2 == 0:
      print("Morgan")
    else:
      print("Luke")
    
