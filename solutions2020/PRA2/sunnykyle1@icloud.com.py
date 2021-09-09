import math

def check_prime(num):
    limit = math.sqrt(num)
    for f in range(2, int(limit + 2)):
        if num % f == 0:
            return False
    return True

answers = []
num_ints = int(input())
for i in range(num_ints):
    prime = input()
    emirp = prime[::-1]
    if not check_prime(int(prime)):
        answers.append("NO")
        continue
    if prime == emirp:
        answers.append("NO")
        continue
    if check_prime(int(emirp)):
        answers.append("YES")
    else:
        answers.append("NO")

[print(a) for a in answers]
