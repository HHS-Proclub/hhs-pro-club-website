n = int(input())

for i in range(n):
    s = [int(i) for i in input().split()]
    d1 = s[2] - s[1]
    d2 = s[1] - s[0]
    r1 = s[2] / s[1];
    r2 = s[1] / s[0];

    if d1 == d2:
        print(int(s[2] + d1));
    else:
        print(int(s[2] * r1));
