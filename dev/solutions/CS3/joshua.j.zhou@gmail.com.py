n = int(input())

def f(n):
    return sum(int(i) ** 2 for i in str(n))

for i in range(10000):
    n = f(n)
    if n == 1:
        print("happy")
        exit()

print("sad")
