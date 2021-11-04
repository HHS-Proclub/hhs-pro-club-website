
T = int(input())
N = []
M = []
for i in range(T):
  temp = input()
  temp = temp.split(" ")
  N.append(int(temp[0]))
  M.append(int(temp[1]))

for i in range(len(N)):
  print(N[i] + M[i])