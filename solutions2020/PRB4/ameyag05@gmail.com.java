import random
timesRun = int(input(""))
for timesRunning in range(timesRun):
    function = []
    numberList = []
    finalNum = []
    allFinalNums = []
    for numbers in range(9):
        function.append(random.randrange(0,10,1))
    lenNums = int(input(""))
    number = int(input(""))
    print(function)
    for iterate in str(number):
        numberList.append(int(iterate))
    for checkVal in function:
        i = 0
        if i > len(numberList):
            break
        if checkVal>numberList[i]:
            finalNum.append(checkVal)
        else:
            finalNum.append(numberList[i])
        i = i+1
    allFinalNums.append(finalNum)
print(allFinalNums)

