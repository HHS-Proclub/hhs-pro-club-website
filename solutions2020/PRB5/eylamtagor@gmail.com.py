cases = int(input(''))

for i in range(cases):

  n = int(input(''))

  k = int(input(''))

  for j in range(n):

    if ((j + 1) * (10**k)) % n == 0:

      print((j + 1) * (10**k))

      break