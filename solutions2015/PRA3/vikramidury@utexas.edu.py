n = int(input())
list = []

total = 0
for i in range(n):
    num = int(input())
    list.append(num)
    total += num

pivot = 0
left = 0
right = total
for i in range(n):
    left += list[pivot]
    right -= list[pivot]
    if left-list[pivot] == right:
        break
    pivot += 1

print(pivot)
