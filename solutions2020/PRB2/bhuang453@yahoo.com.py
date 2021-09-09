dabmaster = int(input())
for i in range(0,dabmaster):
    nandd = input().split()
    n = int(nandd[0])
    d = int(nandd[1])
    nminusd = n - d
    crickets = int(input())  
    for k in range(0,crickets):
      cricoordinates = input().split()
      c = int(cricoordinates[0])   
      r = int(cricoordinates[1])   
      if r >= c - d and r <= c + d and r >= -c + d and r <= -c + (n + nminusd):      
        print("YES")    
      else:      
        print("NO")
