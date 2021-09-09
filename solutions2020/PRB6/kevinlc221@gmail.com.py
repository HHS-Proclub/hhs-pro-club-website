def lol(listl,x):
  listl.append(listl[x])
  listl.remove(listl[x])

loail = input()
loail = int(loail)
for i in range(0,loail):
  count = 0
  animu = input()
  animu = animu.split()
  n = animu[0]
  n = int(n)
  k = animu[1]
  k = int(k)
  playerlist = input()
  playerlist = playerlist.split()
  playerlistr = [int(x) for x in playerlist]
  for j in range(0,n):
    if playerlistr[1] > playerlistr[0]:
      lol(playerlistr,0)
      count = 1
    if playerlistr[0] > playerlistr[1]:
      count = count + 1
      lol(playerlistr,1)
    if count == k:
      break
  print(playerlistr[0])
