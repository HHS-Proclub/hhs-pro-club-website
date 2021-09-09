lol = int(input())
for i in range(0,lol):
  first = input()
  number = int(first[::-1])
  first = int(first)
  nou = False
  if first == number:
    print("NO")
    continue
  for j in range(2,first):
    if (first % j) == 0:
      print("NO")
      nou = True
      break
  if nou == False:
    for j in range(2,number):
      if (number % j) == 0:
        print("NO")
        nou = True
        break
  if nou == False:
    print("YES")