T = input()
answers = []
def checkNum(answer):
    i = 0
    val = answer
    while val != 1:
        if val % 2 == 1:
            val += 1
        else:
            val = val//2
        
        i += 1
    return i

for i in range(int(T)):
    ans = 0
    binaryNum = input()
    count = len(binaryNum)-1
    for k in str(binaryNum):
        if k == "1":
            ans += (2**count)
        count -= 1
    answers.append(checkNum(ans))

for i in answers:
    print(i)

