def distsq(p0, p1):
    return (p0[0] - p1[0])**2 + (p0[1] - p1[1])**2
def AP5(xs,ys,rs):
    x = float(xs)
    y = float(ys)
    r = float(rs)
    tl = (int(x-r-1),int(y-r-1))
    br = (int(x+r+1),int(y+r+1))
    r2 = r**2
    counter = 0
    for xc in range(tl[0],br[0]):
        for yc in range(tl[1],br[1]):
            if distsq((xc,yc),(x,y)) <= r2:
                counter += 1
    print(counter)
argv = input('').split(' ')
AP5(argv[0],argv[1],argv[2])