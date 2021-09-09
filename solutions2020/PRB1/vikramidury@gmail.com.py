t = int(input())
for i in range(t):
    n = int(input())
    c = 1
    p = 0
    while n - c >= 0:
        n -= c
        c += 1
        p += 1
    print(p)