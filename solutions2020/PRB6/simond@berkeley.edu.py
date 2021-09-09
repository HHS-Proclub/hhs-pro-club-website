numbers = [int(input()), int(input()), int(input()), int(input()), int(input())]
m, s = max(numbers), sum(numbers)
print(m if s == 2 * m else s)
