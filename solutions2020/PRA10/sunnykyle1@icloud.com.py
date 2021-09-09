# 2 3 L
# 1 2 3 M (L wins)
# 3 - 2 = 1 L

# 3 5 L
# 2 3 5 M
# 1 2 3 5 L
# 1 2 3 4 5 M (L wins)
# 5 - 2 = 3 L

# 5 6 7 L
# 2 5 6 7 M
# 1 2 5 6 7 L
# 1 2 3 5 6 7 M
# 1 2 3 4 5 6 7 L (M wins)
# 7 - 3 = 4 M

# 3 8 9 L
# 3 6 8 9 M
# 2 3 6 8 9 L
# 1 2 3 6 8 9 M
# 1 2 3 5 6 8 9 L
# 1 2 3 4 5 6 8 9 M
# 1 2 3 4 5 6 7 8 9 L (M wins)
# 9 - 3 = 6 M

# 1 2 3 4 5 ... M
# 2 4 6 8 10 ... M
# 3 6 9 12 15 ... M
# 4 8 12 16 20 ... M
# x 2x 3x 4x 5x ... M

# 2 4 8 L
# 2 4 6 8 M (L wins)

# 3 9 15 L
# 3 6 9 15 M
# 3 6 9 12 15 L (M wins)

# 2 19999

# Highest integer - Number of integers at start = Moves before lose NOPE
# Greatest integer / GCF - Number of ints at start = Loser YES

def gcf_of_nums(nums):
    min_num = min(nums)
    factors_to_check = list(filter(lambda z: min_num % z == 0, [x for x in range(1, min_num+1)]))[::-1]
    for f in factors_to_check:
        is_factor = True
        for n in nums:
            if n % f != 0:
                is_factor = False
                break
        if is_factor:
            return f

num = int(input())
winners = []
for i in range(num):
    count = int(input())
    num_set = list(map(int, input().split()))
    gcf = gcf_of_nums(num_set)
    num_moves = round(max(num_set) / gcf) - count
    if num_moves % 2 == 0:
        winners.append("Morgan")
        # print("M")
    else:
        winners.append("Luke")
        # print("L")

[print(w) for w in winners]
