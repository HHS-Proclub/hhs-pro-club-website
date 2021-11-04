#PRA1: GCDs

t = int(input())
cases = []

for i in range(t):
    cases.append(int(input()))

for n in cases:
    change = 0
    GCD = 1
    og_n = n
    while GCD <= 1:
        #find the GCD
        totaled = 0
        for num in list(str(n)):
            totaled = totaled + int(num)

        factors = []
        factor = 1
        while factor <= totaled:
            if n % factor == 0 and totaled % factor == 0:
                factors.append(factor)
            factor += 1

        GCD = factors[-1]
        change += 1
        n += 1


    print(og_n + (change-1))
