linesPerHaiku = 3
haiku = []
ans = []
T = input()

def vowelSearch(i):
  vowelNum = 0
  for k in haiku[i]:
    k = str.lower(k)
    if k == "a" or k == "e" or k == "i" or k == "o" or k == "u":
      vowelNum += 1

  return vowelNum

for i in range(int(T)):
  for k in range(linesPerHaiku):
    haiku.append(input())
    if k % linesPerHaiku == 0 and vowelSearch(len(haiku) - 1) == 5 or k % linesPerHaiku == 2 and vowelSearch(len(haiku)-1) == 5:
      haiku[len(haiku)-1] = "ok"
    elif k % linesPerHaiku == 1 and vowelSearch(len(haiku)-1) == 7:
      haiku[len(haiku)-1] = "ok"
    else:
      haiku.pop(len(haiku)-1)
  if len(haiku) != linesPerHaiku:
    ans.append("NO")
  else:
    ans.append("YES")
  haiku.clear()


for i in range (len(ans)):
  print(ans[i])