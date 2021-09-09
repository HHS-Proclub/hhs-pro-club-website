n = int(input())
scantron = input().split(' ')
key = input().split(' ')

s = 0
for i in range(n):
    if scantron[i] == key[i]:
        s += 4
    else:
        s -= 1

print(s)