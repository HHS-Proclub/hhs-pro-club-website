sum = 0;
for i in range(0,4):
    sum += int(input())


def fact(n):
    if n == 0:
        return 1;
    else:
        return n * fact(n-1);

print(fact(sum))
