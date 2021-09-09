from bisect import bisect_left
fib = [0, 1]
for _ in range(int(input())):
	n = int(input())
	while fib[-1] < n:
		fib.append(fib[-2] + fib[-1])
	i = bisect_left(fib, n)
	print(min(fib[i] - n, n - fib[i - 1]))
