def solve(num,summ):
    global n
    global b
    global heights
    global best

    if summ >= b and summ < best:
      best = summ
  
    if num == n or summ >= best:
      return

    solve(num + 1, summ + heights[num])
    solve(num + 1, summ)

ok = int(input())
for i in range(0,ok):
  best = float("inf")
  meme = [int(x) for x in input().split()]
  n = meme[0]
  b = meme[1]
  heights = []
  for i in range(0,meme[0]):
    heights.append(int(input()))
    
  solve(0,0)
  print(best - b)