
N = int(input())
A, B = int(input()), int(input())

#N = 3
#A, B = 7, 10

ucount = 0
dcount = 0
currmax = -99999999999999
days = 0
#print("A = " + str(A) + ", B = " + str(B))
while days < N:
    comb = A*days - B*(N-days)
    #print("COMB: " + str(comb))
    if comb < 0 and comb > currmax:
        ucount = days
        dcount = N-days
        currmax = comb
    days += 1
#print("Curr Max: " + str(currmax))
if abs(currmax) > B:
    print(ucount*A + abs(currmax)-B)
else:
    print(ucount*A)
