num = int(input())
lst = [0, 1]

for i in range(2,32):
    lst.append(lst[i-2] + lst[i-1])

for _ in range(num):
    n = int(input())
    for i,e in enumerate(lst):
        if n < e:
            print(str(min(e-n, n-lst[i-1])))
            break

