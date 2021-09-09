# PRB4: Slime
# Bit messy since I just got back from coding in Java, but it works. So yay I guess

# Input handling
n = int(input())
for j in range(n):
    slime_num = int(input())
    slimes = [int(i) for i in input().split()]
    maximum_slime = 0
    any_negatives = False
    any_positives = False
    last_slime = 99999999999
    best_difference = 99999999999
    best_addition = 9999999999999
    for slime in slimes:
        maximum_slime += abs(slime)
        if last_slime != 99999999999:
            if (slime > 0 and last_slime > 0) or (slime < 0 and last_slime < 0):
                addition = abs(slime) + abs(last_slime)
                difference = abs(slime - last_slime)
                if addition - difference < best_addition - best_difference:
                    best_addition = addition
                    best_difference = difference
                    # print("{} and {} make {} and {}".format(last_slime, slime, best_addition, best_difference))
        if slime < 0:
            any_negatives = True
        elif slime == 0:
            any_negatives = True
            any_positives = True
        else:
            any_positives = True
        last_slime = slime
    if len(slimes) > 1 and (not any_negatives or not any_positives):
        maximum_slime -= best_addition - best_difference
    print(maximum_slime, flush=True)
