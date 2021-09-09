def unscrambler(s):
  zcount = 0
  ocount = 0
  
  for x in range(0, len(s)):
    if s[x]=="z":
      zcount+=1
      
    if s[x]=="n":
      ocount+=1
      
  while ocount>0:
    print("1", end =" ") 
    ocount-=1
    
  while zcount>0:
    print("0", end =" "), 
    zcount-=1
    
    
num_test_cases = int(input())

for i in range(num_test_cases):
  current_line = input()
  s = input()
  unscrambler(s)



