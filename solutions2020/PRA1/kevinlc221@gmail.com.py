bryan = int(input())
for i in range(0,bryan):
  number = int(input())
  keepcounting = True
  while keepcounting == True:
    number += 1
    if len(list(str(number))) == len(set(list(str(number)))):
      print(number)
      keepcounting = False