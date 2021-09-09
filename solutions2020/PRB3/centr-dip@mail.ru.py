timesRun = int(input())
binaryNumber = []
bigList = []
for run in range(timesRun):
    binaryNumber = []
    strLength = int(input())
    scramble = input()
    if len(scramble) != strLength:
        print("no good")
        break
    for letter in scramble:
        if  letter == 'z':
            binaryNumber.append(0)
        if letter == 'n':
            binaryNumber.append(1)
    binaryNumber.sort(reverse = True)
    bigList.append(binaryNumber)    
for i in bigList:
    print (i)

    
    

