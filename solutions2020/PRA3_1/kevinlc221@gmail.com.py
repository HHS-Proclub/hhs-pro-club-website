ok = int(input())
for i in range(0,ok):
  woodinfoint = [int(x) for x in input().split()]
  woodlength = woodinfoint[0]
  woodsplitnumber = woodinfoint[1]
  wantedwoodlist = [int(x) for x in input().split()]
  wantedwoodlist.sort()
  powerused = 0
  if woodsplitnumber == 1:
    print("0")
  else:
    while len(wantedwoodlist) > 2:
      newerlist = []
      for r in range(0,len(wantedwoodlist)):
        if r == 0:
          newerlist.append(10000000)
        else:
          newerlist.append(abs(wantedwoodlist[0]-wantedwoodlist[r]))
      meme = newerlist.index(min(newerlist))
      minimum = wantedwoodlist[meme]
      temporary = minimum+wantedwoodlist[0]
      powerused += (minimum + wantedwoodlist[0])
      lit = wantedwoodlist[0]
      wantedwoodlist.remove(minimum)
      wantedwoodlist.remove(lit)
      wantedwoodlist.append(temporary)
      if len(wantedwoodlist) == 2:
        powerused += (wantedwoodlist[0] + wantedwoodlist[1])
    print(powerused)
