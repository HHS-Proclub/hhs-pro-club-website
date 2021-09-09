def splitBlock(b):
    buff = ''
    for c in b:
        buff += c

        if len(buff) >= 2:
            yield buff
            buff = ''
    yield buff


def solve(s):
    newString = ''
    block = ''

    for c in s:
        if c in 'aeiou':
            newString += ' '.join(splitBlock(block))
            block = ''
            newString += c
        else:
            block += c

    newString += ' '.join(splitBlock(block))

    return newString


x = int(input())

for i in range(x):
    print(solve(input()))
