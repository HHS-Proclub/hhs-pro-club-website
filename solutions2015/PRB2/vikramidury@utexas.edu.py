low = int(input())
high = int(input())
sum = 0
count = 0
for i in range(low, high):
    if i > 0:
        sum += i
        count += 1
print(sum/float(count))
