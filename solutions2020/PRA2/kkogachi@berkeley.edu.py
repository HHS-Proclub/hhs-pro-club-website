good = int(input())
dist = int(input())

step = 0
count = 0
while step < dist:
    if count % 2 == 0:
        step += good
    else:
        step += good/2.0
    count += 1

print(count)
