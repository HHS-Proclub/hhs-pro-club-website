step = int(input())
dist = int(input())
halfstep = (step + 1) // 2
cycle = step + halfstep
cycles = (dist + cycle - 1) // cycle
print(cycles * 2 - int(cycles * cycle - dist >= halfstep))