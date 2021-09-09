# Python 3 program to check if
# a given number can be expressed
# as power
import math


# Returns true if n can be written
# as x ^ y
def isPower(n):
    # Base case
    if (n <= 1):
        return True

    # Try all numbers from 2 to sqrt(n)
    # as base
    for x in range(2, (int)(math.sqrt(n)) + 1):
        p = x

        # Keep multiplying p with x while
        # is smaller than or equal to x
        while (p <= n):
            p = p * x

            if (p == n):
                return True

    return False


# Driver Program
ok = int(input())
for i in range(0, ok):
    number = 0
    ranges = [int(x) for x in input().split()]
    for k in range(ranges[0], ranges[1] + 1):
        if isPower(k) == True:
            number += 1
    print(number)