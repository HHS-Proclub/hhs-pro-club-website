def lights(rooms):
  
  rooms = rooms.split()
  
  for x in range(0, len(rooms)):
    rooms[x] = int(rooms[x])
    
  a = 0
  
  for i in range(1, len(rooms) - 1):
    if rooms[i] == 0:
      if rooms[i-1] ==1 and rooms[i+1]==1:
        
        rooms[i+1] = 0
        a+=1
        
  print(a)

num_test_cases = int(input())

for i in range(num_test_cases):
  current_line = input()
  rooms = input()
  lights(rooms)

