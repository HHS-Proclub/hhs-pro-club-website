ok = int(input())
for i in range(0,ok):
  woodinfoint = [int(x) for x in input().split()]
  woodlength = woodinfoint[0]
  woodsplitnumber = woodinfoint[1]
  wantedwoodlist = [int(x) for x in input().split()]
  wantedwoodlist.sort()
  wantedwoodlist.reverse()
  powerused = 0
  if woodsplitnumber == 1:
    print("0")
  else:
    for d in range(0,woodsplitnumber-1):
      powerused += woodlength
      woodlength -= wantedwoodlist[d]
    print(powerused)