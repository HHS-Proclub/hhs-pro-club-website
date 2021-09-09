import math
def solve (n):
    if n < -1/8:
        return 0
    return math.floor(((1+8*n) ** 0.5 - 1) / 2)

x = int(input())
for i in range(x):
    print(solve(int(input())))