kevinrossel = input()
kevinrossel = int(kevinrossel)
for i in range(0,kevinrossel):
  hax = input()
  hax = hax.split()
  lit = hax[0]
  lit = int(lit)
  zeros = hax[1]
  zeros = int(zeros)
  meme = 0
  meem = 0
  while True:
    if lit%2 != 0:
      break
    lit = lit/2
    meme = meme + 1
  while True:
    if lit%5 != 0:
      break
    lit = lit/5
    meem = meem + 1
  if zeros < meme or zeros < meem:
    if meem < zeros:
      meem = zeros
    if meme < zeros:
      meme = zeros
  elif zeros >= meme and zeros >= meem:
    meme = zeros
    meem = zeros
  lit = lit*(2**meme)*(5**meem)
  lit = int(lit)
  print(lit)


