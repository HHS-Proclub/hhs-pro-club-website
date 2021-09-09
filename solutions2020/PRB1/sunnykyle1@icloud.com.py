# Giantpizzahead
# PRB1: Adding Numbers

# Get / parse the input
n = int(input())
a = []
b = []
for i in range(n):
    num1, num2 = [int(i) for i in input().split()]
    a.append(num1)
    b.append(num2)

# Add the numbers together
for i in range(n):
    c = a[i] + b[i]
    print(c)

# Done! :)
