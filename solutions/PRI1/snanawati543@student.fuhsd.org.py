T = int(input())
add = []
# Loop through each test case
for i in range(T):
    N, M = map(int, input().split())
    add.append(N + M)
    print("")

for i in range(T):
    print(add[i])