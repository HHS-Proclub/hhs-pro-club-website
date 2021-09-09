def split(word):
  return list(word)

def operation(s):
  c = int(input())
  distinct = []
  
  if c > len(s):
    print("impossible")
    return
  
  for i in range(0, len(s)):
    if s[i] not in distinct:
      distinct.append(s[i])
        
  if len(distinct) >= c:
    print(0)
    
  if len(distinct) < c:
    print(c - len(distinct))
  
num_test_cases = int(input())

for i in range(num_test_cases):
  s = input()
  operation(split(s))