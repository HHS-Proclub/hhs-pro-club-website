sides = [int(input()) for _ in range(3)]
sides = sorted(sides)
while sides[0] + sides[1] <= sides[2]:
    sides[2] = sides[2]-1

print(sum(sides))
