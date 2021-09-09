k1, k2, k3, k4 = map(int, input().split())

_142 = min(k1,k2,k4)
_12 = min(k1-_142,k2-_142)
print(142*_142 + 12*_12)
