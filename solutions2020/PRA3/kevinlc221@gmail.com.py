alright = input()
alright = int(alright)
for i in range(0,alright):
  some = input()
  some = some.split()
  n = some[0]
  n = int(n)
  k = some[1]
  k = int(k)
  p = some[2]
  p = int(p)
  variable = 0
  chinese = 0
  sum = 0
  sumt = 0
  while variable < k:
    chinese = chinese + 1
    variable = chinese**2
  chinese = chinese - 1
  final_number = chinese
  if k == 1:
    print(1)
    continue
  if p - chinese < 0 and n - p < chinese:
    eddie = []
    for y in range(1,chinese + 1):
      eddie.append(y)
    for x in range(1,chinese):
      eddie.append(chinese-x)
    for w in range(0,len(eddie)):
      sumt = eddie[w] + sumt
    eddie[chinese - p + 1:len(eddie)] = []
    eddie[0:chinese-(n - p)-1] = []
    for d in range(0,len(eddie)):
      sum = eddie[d] + sum
    siyong = len(eddie)
    while sum <= sumt:
      final_number = final_number + 1
      sum = sum + siyong
      siyong = siyong + 1
      if sum > sumt:
        final_number = final_number - 1
  elif p - chinese < 0:
    eddie = []
    for y in range(1,chinese + 1):
      eddie.append(y)
    for x in range(1,chinese):
      eddie.append(chinese-x)
    for w in range(0,len(eddie)):
      sumt = eddie[w] + sumt
    eddie[chinese - p + 1:len(eddie)] = []
    for d in range(0,len(eddie)):
      sum = eddie[d] + sum
    siyong = len(eddie)
    while sum <= sumt:
      final_number = final_number + 1
      sum = sum + siyong
      siyong = siyong + 1
      if sum > sumt:
        final_number = final_number - 1
  elif n - p < chinese:
    eddie = []
    for s in range(1,chinese + 1):
      eddie.append(s)
    for r in range(1,chinese):
      eddie.append(chinese-r)
    for w in range(0,len(eddie)):
      sumt = eddie[w] + sumt
    eddie[0:chinese-(n - p)-1] = []
    for d in range(0,len(eddie)):
      sum = eddie[d] + sum
    siyong = len(eddie)
    while sum <= sumt:
      final_number = final_number + 1
      sum = sum + siyong
      siyong = siyong + 1
      if sum > sumt:
        final_number = final_number - 1
  print(final_number)



