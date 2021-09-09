a = [int(input()) for _ in range(int(input()))]

if len(a) == 1:
    print(0)

m, n = 0, sum(a[1:])
for i in range(1,len(a)):
    if m == n:
        print(i-1)
        break;
    m, n = m + a[i-1], n - a[i]

