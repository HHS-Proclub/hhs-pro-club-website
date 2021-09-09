m, n = [int(i) for i in input().split(' ')[1:]]
x, y = [int(i) for i in input().split(' ')]

print(str(not (m % 2 == 1 and n % 2 == 1 or
               m in [1, 2, 3, 4] or
               m == 3 and n in [4, 6, 8])).lower())
