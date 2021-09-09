import sys
n = int(input())
for i in range(0, n):
    c = int(input())
    pockets = [[]]
    var = 0
    while var < c:
        s = sys.stdin.read(1)
        if (s == ' '):
            continue
        else:
            r = int(s)
            var += 1
        #print(r)
        added = False
        for y in pockets:
            #print(y)
            if (r in y):
                #print("found")
                added = False
                continue
            else:
                #print("not found")
                y.append(r)
                added = True
                break
        if (added == False):
            pockets.append([r])
            #print("added")
    #print(pockets)
    print(len(pockets))
        
            
        
