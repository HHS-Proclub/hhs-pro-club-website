def special():
  
  num = input()
  score = 0
  
  if num[0] == "1":
    score += 1
  
  else:
    score -= 1
  
  for i in range(0, len(num)):
    if num[i] == "1" or num[i] == "4":
      score += 1

    if i + 3 <= len(num):
      if num[i] =="4" and num[i+1] == "4" and num[i+2] == "4":
        score -= 1
  
  if score - 1 == len(num):
    print("YES")
    
  else:
    print("NO")

num_test_cases = int(input())

for i in range(num_test_cases):
  special()