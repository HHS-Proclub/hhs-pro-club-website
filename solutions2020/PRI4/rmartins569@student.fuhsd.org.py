def repeat(x): 
    repeated = [] 
    for i in range(0, len(x)): 
        for j in range(i + 1, len(x)): 
            if x[i][0] == x[j][0] and x[i][0] not in repeated: 
                repeated.append(x[i][0]) 
            if x[i][1] == x[j][0] and x[i][1] not in repeated: 
                repeated.append(x[i][1]) 
            if x[i][0] == x[j][1] and x[i][0] not in repeated: 
                repeated.append(x[i][0]) 
            if x[i][1] == x[j][1] and x[i][1] not in repeated: 
                repeated.append(x[i][1]) 
    return repeated 

def gold(s):
  
  bribes = input().split()
  for i in range(0, len(bribes)):
    bribes[i] = int(bribes[i])

  friends = []
  friend_group = []

  for i in range(0, s[1]):
    friend_group = input().split()
    friend_group[0] = int(friend_group[0])
    friend_group[1] = int(friend_group[1])
    friends.append(friend_group)
    friend_group = []
    
  repeat_friends = repeat(friends)

  new_friend_group = []

  for a in range(0, len(repeat_friends)):
    for i in range(0, len(friends)):
      if friends[i - 1][0] == repeat_friends[a] or friends[i - 1][1] == repeat_friends[a]:
        new_friend_group += friends[i - 1]
        friends.pop(i - 1)
    friends.append(new_friend_group)
    new_friend_group = []
    

  min_gold = 0
  useless_bribes = []

  for i in range(0, len(friends)):
    min_bribe = bribes[friends[i][0] - 1]
    useless_bribes.append(friends[i][0] - 1)
    for x in range(1, len(friends[i])):
      useless_bribes.append(friends[i][x] - 1)
      min_bribe = min(min_bribe, bribes[friends[i][x] - 1])
    min_gold += min_bribe
    
  for i in range(0, len(bribes)):
    if i not in useless_bribes:
      min_gold += bribes[i]
  
  print(min_gold)

num_test_cases = int(input())

for i in range(num_test_cases):
  s = input().split()
  s[0] = int(s[0])
  s[1] = int(s[1])
  gold(s)