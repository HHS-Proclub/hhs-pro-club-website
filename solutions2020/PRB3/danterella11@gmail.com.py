def _intToBaseN (x, b, s):
    r = x % b
    s = str(r) + s
    i = int(x / b)
    if i != 0:
        s = _intToBaseN(i, b, s)
    return s

def intToBaseN(x, b):
    return _intToBaseN(x, b, '')

def baseNToInt (x, b):
    return int(x, b)

def solve (n):
    sN = str(n)

    digits = []

    for digit in sN:
        if digit not in digits:
            digits.append(int(digit))

    digits = sorted(digits)
    digitToIndex = {d:i for i, d in enumerate(digits)}

    baseNStr = ''.join(map(lambda d: str(digitToIndex[int(d)]), str(n)))

    base = len(digits)

    integer = baseNToInt(baseNStr, base)

    integer += 1

    newBaseNStr = intToBaseN(integer, base)

    finalStr = ''.join(map(lambda d: str(digits[int(d)]), newBaseNStr))

    print(finalStr)

for x in range(int(input())):
    solve(int(input()))
