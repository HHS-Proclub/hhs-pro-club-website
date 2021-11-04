import math

T = input()
inputs = []
for i in range(int(T)):
    inputs.append(input())
ans = 0


def findGCD(inputVal):
    sum = 0
    for i in str(inputVal):
        sum += int(i)
    if math.gcd(sum, int(inputVal)) != 1:
        ans = inputVal
        print(ans)
        #return ans
    else:
        findGCD(int(inputVal)+1)


for i in range(int(T)):
    #print(inputs[i])
    #print(findGCD(inputs[i]))
    findGCD(inputs[i])