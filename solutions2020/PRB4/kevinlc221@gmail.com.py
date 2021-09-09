lol = input()
lol = int(lol)
for i in range(0,lol):
  siyong = input()
  siyong = siyong.split()
  al = siyong[0]
  al = int(al)
  bl = siyong[1]
  bl = int(bl)
  cl = siyong[2]
  cl = int(cl)
  ml = input()
  ml = int(ml)
  mlist = []
  nlist = []
  klist = []
  fullsum = 0
  litcount = 0
  for z in range(0,ml):
    koolinput = input()
    koolinput = koolinput.split()
    koolinput[0] = int(koolinput[0])
    koolinput[1] = int(koolinput[1])
    klist.append(koolinput)
  klist.sort()
  for t in range(0,len(klist)):
    mlist.append(klist[t][0])
    nlist.append(klist[t][1])
  for k in range(0,len(mlist)):
    if nlist[k] == 0 and al > 0:
      fullsum = mlist[k] + fullsum
      al = al - 1
      litcount = litcount + 1
    elif nlist[k] == 0 and al == 0 and cl > 0:
      fullsum = mlist[k] + fullsum
      cl = cl - 1
      litcount = litcount + 1
    elif nlist[k] == 1 and bl > 0:
      fullsum = mlist[k] + fullsum
      bl = bl - 1
      litcount = litcount + 1
    elif nlist[k] == 1 and bl == 0 and cl > 0:
      fullsum = mlist[k] + fullsum
      cl = cl - 1
      litcount = litcount + 1
  print(litcount,fullsum)


