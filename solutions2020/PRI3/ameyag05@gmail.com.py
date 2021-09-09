import re
timesRun = int(input())
answers = []
def archery():
    numCans = int(input())
    durability = input()
    durab = re.findall('\d+', durability)
    durab = [int(i) for i in durab] 
    durab.sort(reverse = True)
    arrows = 0
    for a in range(numCans):
        transport = (durab[a] * a) + 1
        arrows = transport + arrows
    answers.append(arrows)

for h in range(timesRun):
    archery()

for ans in answers:
    print(ans)