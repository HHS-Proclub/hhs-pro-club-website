timesRun = int(input())
bigAns = [] ###list of the answers
def duplicates ():
    theString = input("")       ### inputs; one for string to be checked the other
    integer = int(input())      ###        is letters to be different
    changes = 0
    dupis = []
    for oops in range(1000):
        if integer>len(theString):  ### if the number of letters to be special is
            bigAns.append('impossible') ### more than len of string it is impossible  
            break
        dupis = "".join(set(theString)) ### returns the string without duplicates
        changes = integer - len(dupis) ### takes the extra slot and replaces it with a different character
        if changes < 0:
            changes = 0
        bigAns.append(changes)
        break
for orange in range(timesRun):     ### calls the function amount of times to be run
    duplicates()
for i in bigAns:                   ### prints out the answers
    print(i)

