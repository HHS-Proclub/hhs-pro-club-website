import random
timesRun = int(input())
answers = []
def bigNums():
    lenNum = int(input())
    theNum = int(input())
    func = []
    newNum = []
    for a in range(9):
        func.append(random.randint(1,9))
    print(func)
    listNum = [int(x) for x in str(theNum)]
    for h in range(len(listNum)):
        condit = False
        while condit == False:
            if h == 0:
                if listNum[h]<func[listNum[h]-1]:
                    newNum.append(func[listNum[h]-1])

                    condit = True
                else:
                    newNum.append(listNum[h]) 
                    
                    condit = True
            elif h > 0:
                if listNum[h]>func[listNum[h]-1] and listNum[h-1]<=func[listNum[h-1]-1]:
                    while h < len(listNum):
                        newNum.append(listNum[h])
                        h = h+1
                    strings = [str(integer) for integer in newNum]
                    a_string = "".join(strings)
                    an_integer = int(a_string)
                    answers.append(an_integer)
                    return None
                elif listNum[h]>func[listNum[h]-1]:
                    newNum.append(listNum[h])
                    condit = True
                else:
                    newNum.append(func[listNum[h]-1])
                    condit = True     
    strings = [str(integer) for integer in newNum]
    a_string = "".join(strings)
    an_integer = int(a_string)
    answers.append(an_integer)
for r in range(timesRun):
    bigNums()

for ans in answers:
    print(ans)