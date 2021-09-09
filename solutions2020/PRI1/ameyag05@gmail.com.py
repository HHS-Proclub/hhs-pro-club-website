timesRun = int(input())
listofAns = []
for eachRun in range(timesRun):
    theVals = []
    onlychoco = []
    theVals = [int(iterate) for iterate in input().split()]
    bag = theVals[0]
    snick = theVals[1]
    hersh = theVals[2]
    onlychoco.append(hersh)
    onlychoco.append(snick)
    sh = snick + hersh
    diff = sh - bag
    findSealedBags =  max(onlychoco) - diff + 1
    listofAns.append(findSealedBags)
for value in listofAns:
    print(value)



