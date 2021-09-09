n = int(input())
a = list(map(int, input().split()))
i = int(input())
print(int(100 * a.count(i) / len(a)))
