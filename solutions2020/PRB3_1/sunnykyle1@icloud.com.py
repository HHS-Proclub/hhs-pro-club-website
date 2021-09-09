# Giantpizzahead
# PRB3_1: Power of Two

# Input handling
sequences = []
for a in range(int(input())):
    # This basically voids the value of input()
    _ = input()
    sequences.append(input().split())

# This problem is too easy, so no explanation is required (hopefully)
for sequence in sequences:
    numbers_to_remove = 0
    for item_count, item in enumerate(sequence):
        remove = True
        for item2_count, item2 in enumerate(sequence):
            if item_count == item2_count:
                continue
            result = int(item) + int(item2)
            while result >= 2:
                if result % 2 != 0:
                    break
                elif result % 2 == 0:
                    result = result / 2
            if result == 1:
                remove = False
                break
        if remove:
            numbers_to_remove += 1
    print(numbers_to_remove)