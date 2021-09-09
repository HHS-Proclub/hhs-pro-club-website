def cuts(s):
  
  dollars = int(s[1])
  seq = input().split()
  
  for i in range(0, len(seq)):
    seq[i] = int(seq[i])
  
  evencount = 0
  oddcount = 0
  cuts_cost = []
  
  for i in range(0, len(seq)):
    if seq[i]%2 == 0:
      evencount += 1
    if seq[i]%2 == 1:
      oddcount += 1
    if evencount == oddcount and i + 2 < len(seq):
      cuts_cost.append(abs(seq[i]-seq[i+1]))
      
  cost = 0
  x = 0
  
  cuts_cost.sort()

  while cost <= dollars and x < len(cuts_cost):
    if cuts_cost != []:
      cost = cuts_cost[x] + cost
    if cuts_cost == []:
      break
    if cost > dollars:
      cost = cost - cuts_cost[x]
      break
    x += 1
    
    
  print(x)
  
num_test_cases = int(input())

for i in range(num_test_cases):
  s = input().split()
  cuts(s)