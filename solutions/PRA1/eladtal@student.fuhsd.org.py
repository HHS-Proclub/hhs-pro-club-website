times = input()
values = []

def greatest(x, y):
    if(y == 0):
        return x
    return greatest(y, x%y)

for i in range(int(times)):
    num = input()
    digit_sum = 0
    start = int(num)
    for i in num:
        digit_sum += int(i)
    gcd = greatest(int(num), digit_sum)
    while(True):
        if(gcd > 1):
            break
        else:
            start += 1
            digit_sum = 0
            for i in str(start):
                digit_sum += int(i)
            gcd = greatest(start, digit_sum)
    values.append(start)

for item in values:
    print(item)
