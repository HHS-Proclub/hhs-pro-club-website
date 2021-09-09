a = input().split(', ')
clumps, re, clustered = 0, a.pop(), False
while a:
    temp = a.pop()
    if not clustered and re == temp:
        clumps += 1
        clustered = True
    elif re != temp:
        clustered = False
    re = temp

print(clumps)
