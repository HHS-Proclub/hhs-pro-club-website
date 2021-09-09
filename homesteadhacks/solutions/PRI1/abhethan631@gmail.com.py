n = int(input())
for i in range(n):
    A,B = input().split()
    A=int(A)
    B=int(B)
    y = 0
    while A <= B:
        y = y + 1
        A = A * 3
        B = B * 2
    print(y)
