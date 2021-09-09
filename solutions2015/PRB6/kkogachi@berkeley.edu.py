l = [int(input()) for _ in range(int(input()))]
m = 0
for i in range(len(l)):
    c = 0
    for j in range(len(l)):
        if i+c < len(l) and l[i+c] == l[-j-1]:
            c += 1
        else:
            m = max(m,c)
            c = 0
    m = max(m,c)

print(m)
