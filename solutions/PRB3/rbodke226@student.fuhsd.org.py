def check_tree(char):
    global treelist
    global adjacency
    global visited
    treelist.append(char)
    visited[char]=True
    flag=True
    for i in adjacency[char]:
        if not visited[i]:
            flag=False
            check_tree(i)
    if flag:
        return
            
t=int(input())
for _ in range(t):
    ans=0
    n,m=map(int,input().split())
    gold=input().split()
    for i in range(n):
        gold[i]=int(gold[i])
    visited=[False]*n
    k=0
    adjacency=[]
    for i in range(n):
        adjacency.append([])
    for i in range(m):
        x,y=map(int,input().split())
        adjacency[x-1].append(y-1)
        adjacency[y-1].append(x-1)
    trees=[]
    
    while True:
        if k==n:
            break
        treelist=[]
        if not visited[k]:
            check_tree(k)
            trees.append(treelist)
        k+=1
    for i in trees:
        temp=2*10**9
        for j in i:
            temp=min(temp,gold[j])
        ans+=temp
    print(ans)
        
            
