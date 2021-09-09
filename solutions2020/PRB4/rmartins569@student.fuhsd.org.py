def love(i):
  return s[i - 1]

def love_triangle(s):
  score = 0
  
  for i in range(0, x):
    if love(love(love(i))) == i:
      score += 1
    if love(love(love(i))) != i:
      score += 0
      
  if score > 0:
    print("YES")
    
  if score == 0:
    print("NO")

num_test_cases = int(input())

for i in range(num_test_cases):
  x = int(input())
  s = input().split()
  for i in range(0, x):
    s[i] = int(s[i])
  love_triangle(s)