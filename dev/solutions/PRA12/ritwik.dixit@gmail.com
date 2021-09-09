
def getKingsDistance(startx, starty, endx, endy):
    distance = 0
    while startx != endx or starty != endy:
        if startx < endx:
            startx += 1
        elif startx > endx:
            startx -= 1
        if starty < endy:
            starty += 1
        elif starty > endy:
            starty -= 1
        distance += 1
    return distance

points = []
numpoints = int(raw_input())
for i in range(numpoints):
    args = raw_input().split()
    points.append([int(args[0]), int(args[1])])

lowestkingsum = 1535000000000008080
for p in points:
    thiskingsum = 0
    for j in points:         #the coordinates
        if i != j:
            px = p[0]
            py = p[1]
            ex = j[0]
            ey = j[1]
            d = getKingsDistance(px, py, ex, ey)        
            thiskingsum += d
    if thiskingsum < lowestkingsum:
        lowestkingsum = thiskingsum

print lowestkingsum        
