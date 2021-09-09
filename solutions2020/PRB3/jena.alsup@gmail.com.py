s = "oneonezerozero"

onecount = 0
zerocount = 0

for x in range(0,len(s)):
  if s[x] == 'n':
    onecount = onecount + 1
  if s[x] == 'z':
    zerocount = zerocount + 1
for y in range(onecount):
  print("1")
for y in range(zerocount):
  print("0")
    
    