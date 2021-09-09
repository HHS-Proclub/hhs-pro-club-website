a = []
c = []
maxB = []
x = int(input())
for i in range(x):
    n, b = list(map(int, input().split()))
    maxB.append(b)
    l = []
    p = []
    for i in range(n):
        m, q = list(map(int, input().split()))
        l.append(m)
        p.append(q)
    a.append(l)
    c.append(p)
def getHigh(a, b, c):
    def combinations(iterable, r, maps):
        fl = []
        pool = tuple(iterable)
        n = len(pool)
        if r > n:
            return
        indices = list(range(r))
        if len(maps) > 1:
            v = min(maps[:r])
        else:
            v = maps[0]
        yield (v)
        yield tuple(pool[i] for i in indices)
        while True:
            for i in reversed(range(r)):
                if indices[i] != i + n - r:
                    break
            else:
                return
            indices[i] += 1
            for j in range(i+1, r):
                indices[j] = indices[j-1] + 1
            z = []
            l = []
            for i in indices:
                z.append(maps[i])
                if len(z) == r:
        	        yield (min(z))
        	        z = []
            yield tuple(pool[i] for i in indices)
    final = []
    for i in range(b):
        f = b-i
        x = list(combinations(a, f, c))
        l = [x[i:i+2] for i in range(0, len(x), 2)]
        for val in l:
            final.append(val[0]*sum(val[1]))
    return(max(final))
for i in range(len(a)):
    pointer = a[i]
    point = c[i]
    theb = maxB[i]
    print(getHigh(pointer, theb, point))