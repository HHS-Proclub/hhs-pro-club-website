def operation(num):
  
  digits = [int(d) for d in str(num)]
  function = input().split()
  
  for i in range(0, len(function)):
    function[i] = int(function[i])
    
  x = 0
    
  for i in range(0, len(digits)):
    if digits[i] < function[digits[i]-1]:
      break
    else:
      x += 1
  
  for i in range(x, len(digits)):
    if digits[i] <= function[digits[i]-1]:
      digits[i] = function[digits[i]-1]
    
    else:
      break
    
  print(int(''.join(str(i) for i in digits)))

num_test_cases = int(input())

for i in range(num_test_cases):
  current_line = input()
  num = str(input())
  operation(num)