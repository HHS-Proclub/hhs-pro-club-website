def bags():
  
  bags_purchased = 0
  
  chocolate = input().split()
  B = int(chocolate[0])
  S = int(chocolate[1])
  H = int(chocolate[2])
  
  mixed_bags = S + H - B
  only_snickers = S - mixed_bags
  only_hersheys = H - mixed_bags
  
  if only_snickers > only_hersheys:
    bags_purchased = only_snickers + 1
    
  if only_hersheys > only_snickers:
    bags_purchased = only_hersheys + 1
    
  if only_hersheys == only_snickers:
    if only_hersheys == 0:
      bags_purchased = 1
    else:
      bags_purchased = only_hersheys + 1
      
  print(bags_purchased)

num_test_cases = int(input())

for i in range(num_test_cases):
  bags()