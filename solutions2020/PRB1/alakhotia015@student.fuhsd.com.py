i = int(input())
x = []
for s in range(i):
    a, b = input().split()
    a = int(a)
    b = int(b)
    x.append(a*b)
for i in range(len(x)):
    print(x[i])
    