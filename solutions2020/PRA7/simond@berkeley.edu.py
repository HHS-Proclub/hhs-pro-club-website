A = input()
n = len(A)
M2 = [0] * (n + 1)
M1 = [1] * n
for L in range(2, n + 1):
	M = []
	for i in range(n - L + 1):
		if A[i] == A[i + L - 1]:
			M.append(max(M1[i], M1[i + 1], M2[i + 1] + 2))
		else:
			M.append(max(M1[i], M1[i + 1]))
	M2 = M1
	M1 = M
print(M1[0])
