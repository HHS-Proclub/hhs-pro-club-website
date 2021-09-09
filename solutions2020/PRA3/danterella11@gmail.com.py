import copy

class BedSetup:
    def __init__ (self, n, k, p):
        self.centralIndex = k
        self.pillows = [0 for i in range(n)]
        self.available = p

    def __getitem__ (self, index):
        return self.pillows[index]

    def addPillowTo (self, index):
        self.pillows[index] += 1
        self.available -= 1

    def addCenter (self):
        return self.addPillowTo(self.centralIndex)

    def moreAvailable (self):
        return self.available >= 0

def check (t, o):
    if abs(t - o ) > 1:
        return True
    return False

def iterateByPairs (l):
    for i0, i1 in zip(range(0, len(l) - 1), range(1, len(l))):
        yield l[i0], l[i1]

def checkPillows (pillows):
    for p0, p1 in iterateByPairs(pillows):
        if check(p0, p1) or check(p1, p0):
            return False
    return True

def step (beds):
    assert 0 <= beds.centralIndex < len(beds.pillows)

    while beds.moreAvailable():
        backUp = copy.copy(beds.pillows)

        beds.addCenter()

        for index in range(beds.centralIndex, len(beds.pillows) - 1, 1):
            if check(beds[index + 1], beds[index]):
                beds.addPillowTo(index + 1)

        for index in range(beds.centralIndex, 0, -1):
            if check(beds[index - 1], beds[index]):
                beds.addPillowTo(index - 1)

        if not checkPillows(beds.pillows):
            break

    if not checkPillows(backUp): #Timeout if makes invalid pillow setup
        while True:
            break

    print(backUp[beds.centralIndex])

def solve (n, p, k):
    beds = BedSetup(n, k, p)
    step(beds)

for i in range(int(input())):
    solve(*map(int, input().split(' ')))
