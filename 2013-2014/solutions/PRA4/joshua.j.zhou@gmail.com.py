#!/usr/bin/env python3
# jx2zhou
# HHS Programming
# Advanced Problem 4: Binary

binary_string = input()
print(bin(eval('0b' + binary_string) * 17)[2:])