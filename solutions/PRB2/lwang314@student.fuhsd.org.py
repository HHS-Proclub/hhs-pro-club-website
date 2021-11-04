import fileinput
inputs = []
for x in fileinput.input():
    if x == "":
        break
    inputs.append(x)
inputs.pop(0)

def syll(sentence):
    count = 0
    vowels = 'aeiou'
    for i in sentence:
        if i in vowels:
            count += 1
    return count

i = 0
while i < len(inputs):
    if syll(inputs[i]) == 5 and syll(inputs[i+1]) == 7 and syll(inputs[i+2]) == 5:
        print("YES")
    else:
        print("NO")
    i+=3