bigdaddy = int(input())
for i in range(0,bigdaddy):
  #ask for the character and relationship amount
  candn = str(input())
  candn = list(map(int,candn.split()))
  #ask for minimum coins
  charactergoldcoins = str(input())
  charactergoldcoins = list(map(int,charactergoldcoins.split()))
  #ask and organize relationships (originalrelationshiplist is the list of original relationships)
  originalrelationshiplist = []
  for i in range(0,candn[1]):
    somethingelse = str(input())
    anotherting = list(map(int,somethingelse.split()))
    a = False
    for l in range(0,len(originalrelationshiplist)):
      if originalrelationshiplist[l][0] == anotherting[0]:
        originalrelationshiplist[l].append(anotherting[1])
        a = True
      elif originalrelationshiplist[l][0] == anotherting[1]:
        originalrelationshiplist[l].append(anotherting[0])
        a = True
      elif originalrelationshiplist[l][1] == anotherting[0]:
        originalrelationshiplist[l].append(anotherting[1])
        a = True
      elif originalrelationshiplist[l][1] == anotherting[1]:
        originalrelationshiplist[l].append(anotherting[0])
        a = True
    if a == False:
      originalrelationshiplist.append(anotherting)
  #this is the list of the minimum costs in the character gold coins for the relationships (yoitsyoboimrminimum is a list of the minimum costs in relationships)
  yoitsyoboimrminimum = []
  for p in range(0,len(originalrelationshiplist)):
    memelist = []
    for q in range(0,len(originalrelationshiplist[p])):
      memelist.append(charactergoldcoins[originalrelationshiplist[p][q]-1])
    yoitsyoboimrminimum.append(min(memelist))
  #clearing originalrelationshiplist of 2d so i can subtract it from the original coin thingie (newerlist is the list of all the ones with relationships)
  newerlist = []
  for o in range(0,len(originalrelationshiplist)):
    for c in range(0,len(originalrelationshiplist[o])):
      newerlist.append(charactergoldcoins[originalrelationshiplist[o][c]-1])
  #the final list with the ones i need to pay for is listfinal
  listfinal = [x for x in charactergoldcoins if x not in newerlist]
  #make a list with only coins you will pay for, i can use https://stackoverflow.com/questions/4211209/remove-all-the-elements-that-occur-in-one-list-from-another
  #now i add everything in listfinal together to get the cost (finalcost)
  finalcost = 0
  for r in range(0,len(listfinal)):
    finalcost += listfinal[r]
  for t in range(0,len(yoitsyoboimrminimum)):
    finalcost += yoitsyoboimrminimum[t]
  print(finalcost)

    