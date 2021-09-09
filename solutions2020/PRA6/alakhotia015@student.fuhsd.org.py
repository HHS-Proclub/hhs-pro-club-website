from collections import deque, defaultdict

def find_path_bfs(roads, start, goal):
    graph = defaultdict(list)
    for x,y in roads:
        graph[x].append(y)
        graph[y].append(x)
    queue = deque([(set(), start)])
    visited = set()
    while queue:
        path, current = queue.popleft()
        if current == goal:
            return path | set([current])
        if current in visited: continue
        visited.add(current)
        for neighbour in graph[current]:
            queue.append(( path | set([current]), neighbour))
    return set() 

def howmanyroads(b,r,s,t, roads):
    path = find_path_bfs(roads, s, t)
    possibleroads = set(( (x,y) for x in range(1,b) for y in range(x+1,b+1) if (x,y) not in roads and not (x in path and y in path) ))
    tot = 0
    for x,y in possibleroads:
        newroads = roads | {(x,y)}
        newpath = find_path_bfs(newroads, s, t)
        if len(newpath) >= len(path):
            tot +=1
    return tot

def useinput():
    x = int(input())
    final =[]
    for i in range(x):
        a, b, c, d = list(map(int, input().split()))
        if c>d: c,d=d,c
        lne = set()
        for j in range(b):
            t = tuple(sorted(map(int, input().split())))
            lne.add(t)
        print(howmanyroads(a,b,c,d, lne))

useinput()