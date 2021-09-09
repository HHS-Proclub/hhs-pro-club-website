num_test_cases = int(input())

def listToString(s):  
    
    str1 = ""  
    
    for ele in s:  
        str1 += ele   
    
    return str1  

def match(S):
  T = list(input())

  if len(T) < len(S) - 1:
    print("NO")
    return
  
  A = S.split('*')
  
  for i in range(0, len(A[0])):
    if A[0][i] == T[i]:
      T[i] = 'a'
    else: 
      print("NO")
      return
    
  x = int(lengths[0]) - 1
  y = int(lengths[1]) - 1
  z = len(A[1])

  for i in range(0, z):
    if S[x - i] == T[y - i]:
      T[y - i] = 'a'
    else:
      print("NO")
      return
    
  T = listToString(T)
  
  if T.isalpha() and T.islower():
    print("YES")
  else:
    print("NO")

for i in range(num_test_cases):
  lengths = input().split()
  S = input()
  match(S)