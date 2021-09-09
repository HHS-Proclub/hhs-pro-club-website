n = int(input())
for i in range(n):
    a, b = input().split()
    y = 0
    a = int(a)
    b = int(b)
    while a <= b:
        y = y + 1
        a = a * 3
        b = b * 2
    print(y)