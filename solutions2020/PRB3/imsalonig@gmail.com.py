PK
      �nOe��^Z  Z     main.pycases = int(input(""))

for x in range(0, cases):
  
  s = input ("")
  print (len(s))
  num0 = 0
  num1 = 0

  for x in range(0,len(s)):
    if (s[x]) == "z":
      num0 += 1
    
    if (s[x]) == "n":
      num1 += 1

  result = ""

  for x in range(0, num1):
    result += "1"
  
  for x in range(0, num0):
    result += "0"
  
  print(result)PK 
      �nOe��^Z  Z                   main.pyPK      5       