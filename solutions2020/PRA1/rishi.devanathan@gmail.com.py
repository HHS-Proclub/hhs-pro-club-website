import sys
numbers = []
for line in sys.stdin:
    numbers.append(line)

num = [w.replace('\n', '') for w in numbers]
nums = [w.split(" ") for w in num]


def bricks(numbers):
    if (int(numbers[0])+int(numbers[1])*5 < int(numbers[2])):
        print ("false")
    if (int(numbers[0]) < int(numbers[2]) % 5):
        print("false")
    else:
        print ("true")

for i in range(0,len(nums)):    
    bricks(nums[i])
