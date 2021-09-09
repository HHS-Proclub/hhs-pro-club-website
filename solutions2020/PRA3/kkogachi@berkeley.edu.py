def knapsack01(w, l):
    dp = [[0 for _ in range(w+1)] for _ in range(len(l)+1)]
    for i in range(len(l)):
        for j in range(w+1):
            if l[i][1] > j:
                dp[i+1][j] = dp[i][j]
            else:
                dp[i+1][j] = max(dp[i][j],
                                 dp[i][j-l[i][1]]+l[i][0])
    """
    for _ in range(len(dp)):
        print(dp[_])
    """
    return dp[len(l)]

_ = int(input())

for __ in range(_):
    x, n, d = [int(_) for _ in input().split(' ')]
    lst = []
    for ___ in range(n):
        lst.append([int(i) for i in input().split(' ')])
    m = [i for i, e in enumerate(knapsack01(x, lst)) if e >= d]
    if len(m) == 0:
        print(-1)
    else:
        print(x - min(m))
