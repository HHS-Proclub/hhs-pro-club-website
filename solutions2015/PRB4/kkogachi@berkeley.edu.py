n = sum([int(input()) for _ in range(4)])
fact = 1
for x in range(2,n+1):
    fact *= x
print(fact)
