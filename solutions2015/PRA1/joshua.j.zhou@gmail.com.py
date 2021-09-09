#!/usr/bin/env python3

from functools import *

def isprime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

n = int(input())

p = reduce(
    lambda x, y: x * y,
    filter(
        lambda x: isprime(x),
        [i for i in range(1, n + 1)]
    )
)

print('%o' % p)