# Giantpizzahead
# PRB2: Points in a Rectangle

# Input handling
k = int(input())
n = []
d = []
m = []
x = []
y = []
for i in range(k):
    num1, num2 = [int(l) for l in input().split()]
    n.append(num1)
    d.append(num2)
    m.append(int(input()))
    for j in range(m[i]):
        num1, num2 = [int(l) for l in input().split()]
        x.append(num1)
        y.append(num2)

# k = Number of years
# If n = 3, d = 5, the bounds of the field would be
# (0, 5) (5, 0) (3, -2) (-2, 3)
# m = Number of crickets for that year
# (x, y) = Location of the current cricket
# Goal: Print "YES" or "NO" depending on whether the cricket is on or in the border of the field

# For loop for years
for i in range(k):
    # For loop for crickets
    for j in range(m[i]):
        # Use compound inequalities to detect if cricket is on or in the field
        cricket_x = x[0]
        cricket_y = y[0]
        if 2*n[i]-d[i] <= cricket_x + cricket_y <= d[i] or 2*n[i]-d[i] >= cricket_x + cricket_y >= d[i]:
            if -d[i] <= cricket_x - cricket_y <= d[i] or -d[i] >= cricket_x - cricket_y >= d[i]:
                print("YES")
            else:
                print("NO")
        else:
            print("NO")
        # Remove index 0 of the cricket location arrays
        x.pop(0)
        y.pop(0)
