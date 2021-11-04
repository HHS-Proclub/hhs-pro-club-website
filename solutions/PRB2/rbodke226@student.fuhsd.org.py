t=int(input())
for _ in range(t):
    flag=True
    line=input()
    count=0
    for i in line:
        if i in ['a','e','i','o','u']:
            count+=1
    if count !=5:
        flag=False
        print('NO')
        continue
    
    line=input()
    count=0
    for i in line:
        if i in ['a','e','i','o','u']:
            count+=1
    if count !=7:
        flag=False
        print('NO')
        continue
    
    line=input()
    count=0
    for i in line:
        if i in ['a','e','i','o','u']:
            count+=1
    if count !=5:
        flag=False
        print('NO')
        continue
    if flag:
        print('YES')
