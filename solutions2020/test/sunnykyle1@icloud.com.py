# Giantpizzahead
# PRA3_1: Cutting Wood
# This one was HARDDDDDD
# Takeaway: BREAKPOINTS / DEBUGGING HELPS A TON!!! SERIOUSLY, USE IT!!!!!

# Input handling
num_of_pieces = int(input())
piece_lengths = []
desired_pieces = []
for i in range(num_of_pieces):
    temp_length, _ = [int (l) for l in input().split()]
    piece_lengths.append([temp_length])
    desired_pieces.append([int (l) for l in input().split()])

# Method 1: Brute Force
# Big O: (Factorial?) SO BAD THAT THEY DON'T EVEN HAVE ANYTHING FOR IT OH MY
# Result: Takes wayyyy too long (kinda expected)
def brute_cut(lengths, desired, energy = 0):
    #print("Temp lengths = {}, Desired = {}, Energy = {}".format(lengths, desired, energy))
    lowest_energy = -1
    if sorted(lengths) == sorted(desired):
        #print("sorted! {}".format(energy))
        return energy
    elif len(lengths) >= len(desired):
        #print("too long!")
        return -1
    else:
        for length_count, length in enumerate(lengths):
            for i in range(1, int(length/2+1)):
                temp_lengths = list(lengths)
                temp_lengths.pop(length_count)
                temp_lengths.append(length-i)
                temp_lengths.append(i)
                #print("Temp lengths = {}, Lengths = {} right before recursion call".format(temp_lengths, lengths))
                energy_taken = brute_cut(temp_lengths, desired, energy = energy + length)
                if (energy_taken <= lowest_energy and energy_taken != -1) or lowest_energy == -1:
                    #print("Lowest energy changed! {}".format(energy_taken))
                    lowest_energy = energy_taken
        return lowest_energy
#for i in range(num_of_pieces):
    #print(brute_cut(piece_lengths[i], desired_pieces[i]))


# Method 2: Backwards Brute Force
# Big O: n squared I think? Quadratic, Not as bad as the 1st method.
# Result: Still too long
def backwards_brute_cut(lengths, energy = 0):
    #print("Lengths = {}, Energy = {}".format(lengths, energy))
    lowest_energy = -1
    if len(lengths) == 1:
        return energy
    else:
        for length_count, length in enumerate(lengths):
            temp_lengths = list(lengths)
            temp_lengths.pop(length_count)
            #print("Temp_lengths = {} after first remove".format(temp_lengths))
            for length_count2, length2 in enumerate(temp_lengths):
                temp2_lengths = list(temp_lengths)
                temp2_lengths.pop(length_count2)
                temp2_lengths.append(length + length2)
                #print("Temp2_lengths = {} before recursion".format(temp2_lengths))
                energy_taken = backwards_brute_cut(temp2_lengths, energy = energy + length + length2)
                if (energy_taken < lowest_energy and energy_taken != -1) or lowest_energy == -1:
                    #print("Lowest energy changed! {}".format(energy_taken))
                    lowest_energy = energy_taken
        return lowest_energy
#for i in range(num_of_pieces):
    #print(backwards_brute_cut(desired_pieces[i]))


# Method 3: Simpler Backwards Brute Force
# Big O: n*log(n) Linearithmic, Even better!
# Result: It ran it 0.01 seconds! And it worked! YAY!
def backwards_smart_cut(lengths, energy = 0):
    #print("Lengths = {}, Energy = {}".format(lengths, energy))
    if len(lengths) == 1:
        return energy
    else:
        lengths.append(lengths[0] + lengths[1])
        lengths.pop(0)
        lengths.pop(0)
        energy_taken = backwards_smart_cut(sorted(lengths), energy = energy + lengths[-1])
        lowest_energy = energy_taken
        return lowest_energy

for i in range(num_of_pieces):
    print(backwards_smart_cut(sorted(desired_pieces[i])))
