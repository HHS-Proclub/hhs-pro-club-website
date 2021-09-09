n = int(input())
max = int(input())
for i in range(n-1):
    curr = int(input())
    if curr > max:
        max = curr
print(max)
