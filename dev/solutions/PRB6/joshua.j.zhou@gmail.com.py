n = int(input())

matrix = [[int(i) for i in input().split()]
          for _ in range(n)]

for i in zip(*matrix[::-1]):
    for j in range(len(i)):
        if j == len(i) - 1:
            print(i[j], end='')
        else:
            print(i[j], end=' ')
    print()
