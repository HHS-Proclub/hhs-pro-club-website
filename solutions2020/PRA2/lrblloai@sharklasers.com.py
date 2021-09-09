from collections import deque
siyong = input()
siyong = int(siyong)
for i in range(0,siyong):
  count = 0
  countl = 0
  n = input()
  n = int(n)
  meem = input()
  meem = meem.split()
  for k in range(0,len(meem)):
    meem[k] = int(meem[k])
  meme = input()
  meme = meme.split()
  for j in range(0,len(meme)):
    meme[j] = int(meme[j])
  for l in range(0,len(meem)):
    if meem[l] > 0:
      count = count + 1
  for s in range(0,len(meme)):
    if meme[s] > 0:
      countl = countl + 1
  if count != countl:
    print("NO")
    continue
  meme.remove(0)
  meem.remove(0)
  lit = deque(meem)
  kaiwen = deque(meme)
  for a in range(0,len(meem)):
    lit.rotate(1)
    if lit == kaiwen:
      print("YES")
      break
  if lit == kaiwen:
    continue
  print("NO")