a = int(input())
b = int(input())

al = list(str(a))[::-1]
bl = list(str(b))[::-1]

r = []

for i, j in zip(al, bl):
    r.append((int(i) + int(j)) % 10)

print(''.join([str(i) for i in r[::-1]]))
