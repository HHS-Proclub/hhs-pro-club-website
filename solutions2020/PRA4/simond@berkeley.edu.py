a = int(input())
b = int(input())
c = int(input())
longest = max(a, b, c)
others = a + b + c - longest
print(others + min(longest, others - 1))
