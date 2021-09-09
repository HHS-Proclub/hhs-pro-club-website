def arrows(s):
  
  arrow_count = 0
  for i in range(0, len(s)):
    s[i] = int(s[i])
    
  s.sort(reverse = True) 
  
  for i in range(0, len(s)):
    arrow_count = arrow_count + s[i] * i + 1
  
  print(arrow_count)
  

num_test_cases = int(input())

for i in range(num_test_cases):
  current_line = input()
  s = input().split()
  arrows(s)