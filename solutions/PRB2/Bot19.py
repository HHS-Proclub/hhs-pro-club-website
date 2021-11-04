amt = int(input())
haikus = []

def vowelAmt(line):
    vowels = 'aeoui'
    amt = 0
    for char in line:
        if(char in vowels):
            amt += 1
    return amt

for i in range(amt):
    haikus.append([input(), input(), input()])
for haiku in haikus:
    lines = 1
    isHaiku = True
    for line in haiku:
        if(lines == 2):
            if(vowelAmt(line) != 7):
                isHaiku = False
        else:
            if(vowelAmt(line) != 5):
                isHaiku = False
        lines += 1
    if(isHaiku): print('YES')
    else: print('NO')