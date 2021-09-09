amount = input()
amount = int(amount)
for i in range(0,amount):
  number = input()
  digits = [(d) for d in str(number)]
  number = int(number)
  combs = []
  lol = digits[0] + digits[1]
  lol = int(lol)
  other = digits[1] + digits[0]
  other = int(other)
  meme = digits[0] + digits[0]
  meme = int(meme)
  use = digits[1] + digits[1]
  use = int(use)
  if lol > number:
    print(lol)
    continue
  elif other > number:
    print(other)
    continue
  elif meme > number:
    print(meme)
    continue
  elif use > number:
    print(use)
    continue
