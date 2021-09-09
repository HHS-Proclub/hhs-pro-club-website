A = [int(x) if int(x)%10 == 0 else 0 for x in input().split()]
B = [int(x) if int(x)%10 == 0 else 0 for x in input().split()]

s = max(A) + max(B)
print(s)
