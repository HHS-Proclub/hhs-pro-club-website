n = int(input())

square = []

for i in range(n):
    square.append([int(i) for i in input().split()])

def check():
    ss = sum(square[0])
    for i in range(n):
        if sum(square[i]) != ss:
            return False

    for i in range(n):
        s = 0
        for j in range(n):
            s += square[i][j]
        if s != ss:
            return False

    sum1 = sum2 = 0
    for i in range(n):
        sum1 += square[i][n - j - 1]
        sum2 += square[i][i]

    if sum1 != ss or sum2 != ss:
        return False

    return True

print("yes" if check() else "no")
            
