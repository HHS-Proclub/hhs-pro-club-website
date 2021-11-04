import fileinput
import math
inputs = [];
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)

inputs.pop(0)

x=0

def count(lst, x):
    count = 0
    for ele in lst:
        if (ele == x):
            count = count + 1
    return count
    
def friendsFunc(friendGroup, pairs, x):
    j=0
    while j < len(pairs):
        if x in pairs[j]:
            if pairs[j][1] in friendGroup and pairs[j][0] in friendGroup:
                return friendGroup
            if pairs[j][0] not in friendGroup:
                friendGroup.append(pairs[j][0])
                friendsFunc(friendGroup, pairs, pairs[j][0])
            if pairs[j][1] not in friendGroup:
                friendGroup.append(pairs[j][1])
                friendsFunc(friendGroup, pairs, pairs[j][1])
        j+=1
    return friendGroup
while x < len(inputs):
    m = int(inputs[x].split(" ")[1]) #friends
    characters = inputs[x+1].split(" ") #characters with their gold cost
    
    i=0
    pairs = []
    friends = []
    spreaded = []
    while i < m:
        pairs.append([int(inputs[x+i+2].split(" ")[0].replace('\n','')),int(inputs[x+i+2].split(" ")[1].replace('\n',''))])
        friends.append(int(inputs[x+i+2].split(" ")[0].replace('\n','')))
        friends.append(int(inputs[x+i+2].split(" ")[1].replace('\n','')))
        i+=1
    i=0
    cost = 0
    groups = []
    while i < len(characters):
        if i+1 not in friends:  #no friends, easy case
            cost += int(characters[i].replace('\n',''))
            spreaded.append(i+1)
        else: #oh no they are friend
            if count(friends, i+1) == 1 and i+1 not in spreaded:
                j=0
                while j < len(pairs):
                    if i+1 in pairs[j]:
                        if count(friends, pairs[j][0]) == 1 and count(friends, pairs[j][1]) == 1:
                            cost += min(int(characters[pairs[j][0]-1].replace('\n','')),int(characters[pairs[j][1]-1].replace('\n','')))
                            spreaded.append(pairs[j][0])
                            spreaded.append(pairs[j][1])
                    j+=1
            elif count(friends, i+1) > 1 and i+1 not in spreaded:
                friendGroup = [i+1]
                friendGroup = friendsFunc(friendGroup, pairs, i+1)
                j=0
                lowestCost = int(friendGroup[0])
                while j < len(friendGroup):
                    if int(characters[friendGroup[j]-1].replace('\n','')) < lowestCost:
                        lowestCost = int(characters[friendGroup[j]-1].replace('\n',''))
                    spreaded.append(friendGroup[j])
                    j+=1
                cost+=lowestCost
        i+=1
    print(cost)
    x+=(m+2)