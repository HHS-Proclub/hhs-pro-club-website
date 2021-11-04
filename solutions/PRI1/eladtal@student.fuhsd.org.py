times = input()
sums = []
for i in range(int(times)):
    nums = input()
    sum = 0
    for i in nums.split(' '):
        sum += int(i)
    sums.append(sum)

for item in sums:
    print(item)
