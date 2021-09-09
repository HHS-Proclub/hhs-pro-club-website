bryan = int(input())
for i in range(0,bryan):
  inputthing = input()
  danke = [int(x) for x in inputthing.split()]
  sume = 0
  for j in range(0,len(danke)):
    sume += danke[j]
  print(sume)
