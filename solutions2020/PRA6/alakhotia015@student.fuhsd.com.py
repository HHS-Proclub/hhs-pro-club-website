from itertools import product
from collections import deque

def breadthfirstsearch(graph, start, goal):
    if start == goal:
        return [start]
    visited = {start}
    queue = deque([(start, [])])

    while queue:
        current, path = queue.popleft()
        visited.add(current)
        for neighbor in graph[current]:
            if neighbor == goal:
                return path + [current, neighbor]
            if neighbor in visited:
                continue
            queue.append((neighbor, path + [current]))
            visited.add(neighbor)  
    return None

def buildGraph(cool):
    alrd = []
    graph = {}
    for val in cool:
        n1 = val[0]
        n2 = val[1]
        if n1 not in alrd:
            alrd.append(n1)
            graph[n1] = [n2]
        else:
            graph[n1].append(n2)
        if n2 not in alrd:
            alrd.append(n2)
            graph[n2] = [n1]
        else:
            graph[n2].append(n2)
    return graph

def getInput():
    x = int(input())
    final =[]
    for i in range(x):
        a, b, c, d = list(map(int, input().split()))
        lne = set()
        for j in range(b):
            t = tuple(map(int, input().split()))
            lne.add((t[0]-1,t[1]-1))
        r = [a, c-1, d-1, lne]
        final.append(r)
    return final

def generateInput(i1,i2,i3):
    x=1
    a,c,d = i1,i2,i3
    lne = [[a, a+1] for a in range(a)]
    b = len(lne)
    return [[a, c-1, d-1, lne]]

final = getInput()
#final = generateInput(5,1,5)
#final += generateInput(5,3,5)
#final += generateInput(100,50,100)
#final += generateInput(1000,25,570)

for buildings, home, school, cool in final:
    graph = buildGraph(cool)
    path = breadthfirstsearch(graph, home, school)
    pathL = range(len(path))
    lis = list(range(buildings))

    ##this part not needed, as we do (i<j) checks in the loops
    #for i in lis:
    #    notAllowed.append([i, i])

    ##turns out this loop just gave you back cool
    notAllowed = cool 
    #for key, val in graph.items():
    #    for v in val:
    #        n = sorted([key, v])
    #        if n not in notAllowed1:
    #            notAllowed1.append(n)

    ## they're sets now, so we union (|) them together.
    notAllowed = notAllowed | set((path[x],path[y])  for x,y in product(pathL, pathL) if x<y)
    #for i in range(len(path)):
    #    for j in range(len(path)):
    #        n = sorted([path[i], path[j]])
    #        if n not in notAllowed:
    #            notAllowed.add(n)

    possibleRoads = set((x,y) for x,y in product(lis, lis) if x<y and (x,y) not in notAllowed)
    #roads = 0
    #for i in lis:
    #    for j in lis:
    #        if i<j and (i, j) not in notAllowed:
    #            possibleRoads.add((i, j))
    #            notAllowed.add((i, j))
    #            roads += 1

    print(len(possibleRoads))