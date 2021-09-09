inp = int(input())
finNums = []
for j in range (inp):
    x, y = input().split()
    z = int(x)*int(y)
    finNums.append(z)
for i in range (len(finNums)):
    print(finNums[i])
    
