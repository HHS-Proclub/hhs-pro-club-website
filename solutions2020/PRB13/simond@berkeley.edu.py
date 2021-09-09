k1, k2, k3, k4 = map(int, input().split())
num_142s = min(k1, k2, k4)
print(142 * num_142s + 12 * min(k1 - num_142s, k2 - num_142s))
