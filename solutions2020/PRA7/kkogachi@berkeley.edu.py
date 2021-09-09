s = input()

dp = [[0]*len(s) for _ in range(len(s))]

for i in range(len(s)):
    dp[i][i] = 1

for k in range(1, len(s)):
    for i in range(0, len(s)-k):
        dp[i][i+k] = max(dp[i][i+k-1], dp[i+1][i+k])
        if s[i] == s[i+k]:
            dp[i][i+k] = max(dp[i][i+k], 2+dp[i+1][i+k-1])

print(dp[0][len(s)-1])
