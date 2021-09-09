import sys

for line in sys.stdin:
    small, big, row = map(int, line.split())
    print(str(row - min(row // 5 * 5,  big * 5) <= small).lower())
