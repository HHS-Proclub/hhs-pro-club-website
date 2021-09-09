ok = int(input())
for i in range(0,ok):
  tickets = int(input())
  digits = input()
  totalvalue = 0
  listofstuff = []
  dabber = False
  for k in range(0,len(digits)):
    totalvalue += int(digits[k])
  for j in range(2, totalvalue):
       if totalvalue % j == 0:
          listofstuff.append(j)
  for f in range(0,len(listofstuff)):
    tempnumber = 0
    referencepoint = 0
    for d in range(0,len(digits)):
      tempnumber += int(digits[d])
      if tempnumber > listofstuff[f]:
        break
      if tempnumber == listofstuff[f]:
        tempnumber = 0
    if tempnumber == 0:
      dabber = True
      break
  if dabber == True:
    print("YES")
  else:
    print("NO")