n = int(input())
v = []
for i in range(n):
    x = list(map(int,input().split()))
    v.append(x)
for i in v:
    print(i[0] * i[1])
