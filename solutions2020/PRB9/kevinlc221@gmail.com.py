def sum_digits(n):
    s = 0
    while n:
        s += n % 10
        n //= 10
    return s

ok = int(input())
for i in range(0,ok):
  meme = int(input())
  dab = 10 + meme*9
  while sum_digits(dab) != 10:
    dab += 9
  print(dab)
