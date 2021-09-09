from itertools import combinations
import numpy as np

length = [[12, 31], [112, 4], [100, 100], [13, 55], [55, 50]]
max = 3

combList = list(combinations(length, max))
totalValues = []

for x in range(len(combList)):
    minPleasure = 0
    pleasureArr = []
    lenTotal = 0
    lenList = combList[x]
    for i in range(max):
        lenTotal = lenTotal+lenList[i][0]
        pleasureArr.append(lenList[i][1])
        minPleasure = np.min(pleasureArr)

    #totalValues.append(minPleasure*lenTotal)
    print(lenTotal*minPleasure)

