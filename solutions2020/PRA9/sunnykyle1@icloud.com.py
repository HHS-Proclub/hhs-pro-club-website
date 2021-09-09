'''
PRB9: Cow Stacking
BOSS PROBLEM

Alright. Here we go. All the previous problems have been to prepare
for (what I think will be) the hardest problem on the programming
club website. This one is going to be reallllly tough. I might not be able to
do it, but it'll be a great learning experience no matter what happens.

I hope you're ready.
Here we go... tomorrow bc im rlly tired aight cya byeeeeeeee

Ok, now we go for real. This one will be a pain to get within the time
limit, but I know you can do it! :)
Whatever you do, don't give up. If you never give up, you will succeed
eventually (I mean unless it's impossible but um ya).

Let's do this.

Logging what I do here so I can look back at my thinking process.
So, I took some time to think about the problem. Instead of just going
for it right away, I think I should try and solve a simpler problem first:
Given a set of integers, determine if there is a subset that sums up
to a given target number. Answer should have no more than a time complexity
of n^2.
I'll write my gained insights here after solving this (if there are any).
I've edited the problem so that you only have to print the # of subsets, so
that I don't have to deal with horrible list stuff.
Ok, so you can remember your previous calculations to speed up this process
a LOT. Alright, now time to tackle the main problem! Here we go. :)

It's been about 4 hours now. I'm really close. I can feel it. But now I don't
know what to do. The code passes all the test cases I can think of, but
apparently it's still giving incorrect output. Oh well. Guess I'll take another
shot at it tomorrow.

Ok, in order to save some time (hopefully), since I have a life / other hw to
do, I'm going to solve this problem the bad way (using inefficient recursion).
The given test data appears to be small, so it'll run within the time limit.
Feels a bit cheaty, but I mean, the test data is small enough sooo ya.
'''

already_done = {}
already_done2 = {}

best_sum = 999999999999


def solve_lazy(cow_heights, shelf_height):
    '''Solves this problem the lazy way.'''
    global best_sum
    best_sum = 999999999999
    rec_lazy(cow_heights, shelf_height, 0, len(cow_heights) - 1)
    return best_sum - shelf_height


def rec_lazy(cow_heights, shelf_height, total, curr_index):
    global best_sum

    if total >= shelf_height and total < best_sum:
        # print("New best sum: ", total)
        best_sum = total

    if curr_index < 0:
        # Reached end of heights; stop
        return
    elif total >= best_sum:
        # Already worse than best; stop
        return

    rec_lazy(cow_heights, shelf_height, total + cow_heights[curr_index], curr_index - 1)
    rec_lazy(cow_heights, shelf_height, total, curr_index - 1)


def solve_problem(cow_heights, shelf_height):
    '''Main problem solving method.'''
    cow_dict = make_dictionary(cow_heights)
    low_to_high = sorted(list(cow_dict.keys()))
    high_to_low = sorted(cow_heights)[::-1]
    curr_total_height = 0
    curr_cows = {}
    available_cows = cow_dict
    # Preliminary setup: Keep adding cows until current height exceeds
    # shelf height
    for c in high_to_low:
        curr_total_height += c
        if c not in curr_cows:
            curr_cows[c] = 0
        curr_cows[c] += 1
        available_cows[c] -= 1
        if available_cows[c] == 0:
            available_cows.pop(c)
            low_to_high.remove(c)
        if curr_total_height >= shelf_height:
            break
    # Main height checking loop
    done = False
    while not done:
        done = True
        if curr_total_height == shelf_height:
            # Optimal solution found (perfect height), no need to continue
            '''print("---")
            print("Current: ", curr_cows)
            print("Available: ", available_cows)
            print("Optimal configuration found!")'''
        else:
            '''print("---")
            print("Current: ", curr_cows)
            print("Available: ", available_cows)
            print("Current height: ", curr_total_height)'''
            for c in curr_cows:
                # Replace current cow with smaller cows if beneficial
                new_cows = find_smaller_cows(available_cows, c, curr_total_height - shelf_height)
                if len(new_cows) != 0:
                    curr_cows[c] -= 1
                    if curr_cows[c] == 0:
                        curr_cows.pop(c)
                    if c not in available_cows:
                        available_cows[c] = 0
                        index_to_insert = low_to_high.index(find_closest_smaller(low_to_high, c)) + 1
                        if len(low_to_high) >= index_to_insert:
                            low_to_high.insert(index_to_insert, c)
                        else:
                            low_to_high.append(c)
                    available_cows[c] += 1
                    curr_total_height -= c
                    for nc in new_cows:
                        if nc not in curr_cows:
                            curr_cows[nc] = 0
                        curr_cows[nc] += 1
                        available_cows[nc] -= 1
                        if available_cows[nc] == 0:
                            available_cows.pop(nc)
                            low_to_high.remove(nc)
                        curr_total_height += nc
                    done = False
                    break
            # Check if biggest cows can be merged into a smaller cow
            if len(curr_cows) > 1:
                for c in curr_cows:
                    for d in curr_cows:
                        if c == d and curr_cows[c] == 1:
                            continue
                        new_cows = find_smaller_cows(available_cows, c + d, curr_total_height - shelf_height)
                        if len(new_cows) != 0:
                            curr_cows[c] -= 1
                            if curr_cows[c] == 0:
                                curr_cows.pop(c)
                            if c not in available_cows:
                                available_cows[c] = 0
                                try:
                                    index_to_insert = low_to_high.index(find_closest_smaller(low_to_high, c)) + 1
                                except ValueError:
                                    index_to_insert = 0
                                if len(low_to_high) >= index_to_insert:
                                    low_to_high.insert(index_to_insert, c)
                                else:
                                    low_to_high.append(c)
                            available_cows[c] += 1
                            curr_cows[d] -= 1
                            if curr_cows[d] == 0:
                                curr_cows.pop(d)
                            if d not in available_cows:
                                available_cows[d] = 0
                                try:
                                    index_to_insert = low_to_high.index(find_closest_smaller(low_to_high, d)) + 1
                                except ValueError:
                                    index_to_insert = 0
                                if len(low_to_high) >= index_to_insert:
                                    low_to_high.insert(index_to_insert, d)
                                else:
                                    low_to_high.append(d)
                            available_cows[d] += 1
                            curr_total_height -= c
                            curr_total_height -= d
                            for nc in new_cows:
                                if nc not in curr_cows:
                                    curr_cows[nc] = 0
                                curr_cows[nc] += 1
                                available_cows[nc] -= 1
                                if available_cows[nc] == 0:
                                    available_cows.pop(nc)
                                    low_to_high.remove(nc)
                                curr_total_height += nc
                            done = False
                            break
                    if not done:
                        break
    '''print("---FINAL---")
    print("With cows: {}".format(repr(curr_cows)))
    print("Answer: ", curr_total_height - shelf_height)'''
    return curr_total_height - shelf_height


def find_smaller_cows(available_cows, cow, max_height_diff):
    '''Finds smaller cows. Should always return a list.'''
    best_height_diff = 0
    best_cows = []
    # print("Finding smaller cows with ", cow, max_height_diff)
    # Look for 1 cow that is smaller than current cow
    for c in available_cows:
        if cow - c > best_height_diff and cow - c <= max_height_diff:
            # print("New best cow! {} replaces {}".format(c, cow))
            best_height_diff = cow - c
            best_cows = [c]
            if best_height_diff == max_height_diff:
                break
    # Look for sets of 2 or more cows that are smaller than current cow
    if best_height_diff == 0:
        best_cows = find_smaller_groups(available_cows, cow, max_height_diff)
    return best_cows


def find_smaller_groups(available_cows, cow, max_height_diff):
    '''Recursive method to find even smaller cows.'''
    cow_list = []
    for cow_height in available_cows:
        for i in range(available_cows[cow_height]):
            cow_list.append(cow_height)
    if max_height_diff > 0:
        best_cows = find_closest_sum(cow_list, cow, max_height_diff)
        return best_cows
        '''smaller_cow = find_closest_smaller(list(available_cows.keys()), int(max_height_diff / 2))
        available_cows[smaller_cow] -= 1
        if available_cows[smaller_cow] == 0:
            available_cows.pop(smaller_cow)
        answer = find_smaller_groups(available_cows, max_height_diff - smaller_cow)'''
    else:
        return []


def find_closest_sum(numbers, target_sum, max_diff):
    # print("Finding target sum of {} with max_diff {}".format(target_sum, max_diff))
    closest_subset = rec_closest_sum(numbers, target_sum, target_sum, max_diff, len(numbers) - 1, [])
    # print(closest_subset)
    if closest_subset == -1 or closest_subset[1] == target_sum:
        return []
    else:
        return closest_subset[0]


def rec_closest_sum(numbers, orig_target, target_sum, max_diff, current_index, used_numbers):
    '''
    Returns the subset of numbers that gets furthest away from (but not
    exceeding max_diff) the target sum.
    '''
    best_subset = -1
    key = str(numbers) + ';' + str(orig_target) + ';' + str(max_diff) + ';' + str(used_numbers) + ';' + str(current_index)
    if key in already_done:
        # Current list in saved calculations; No need to do the same calculation again
        return already_done[key]
    elif target_sum <= max_diff and target_sum >= 0:
        # Working subset found: Return numbers in the working subset / the sum
        # print(used_numbers, sum(used_numbers))
        return (used_numbers, sum(used_numbers))
    elif target_sum < 0:
        # Went over: Notify previous recursion
        return -1
    elif current_index < 0:
        # Reached end of array: Return current numbers / sum
        return -1
    elif target_sum < numbers[current_index]:
        # Number is greater than target_sum, so no point in recursing
        # further; skip the current number instead
        skip_set = rec_closest_sum(numbers, orig_target, target_sum, max_diff, current_index - 1, used_numbers)
        if skip_set == -1:
            skip_set = (used_numbers, sum(used_numbers))
        if skip_set[1] >= orig_target - max_diff:
            # print("Setting best subset to ", skip_set)
            best_subset = skip_set
    else:
        # Continue recursing with the current number factored in; also try
        # skipping the number
        skip_set = rec_closest_sum(numbers, orig_target, target_sum, max_diff, current_index - 1, used_numbers)
        if skip_set == -1:
            skip_set = (used_numbers, sum(used_numbers))
        new_numbers = used_numbers[:]
        new_numbers.append(numbers[current_index])
        deep_set = rec_closest_sum(numbers, orig_target, target_sum - numbers[current_index], max_diff, current_index - 1, new_numbers)
        if deep_set == -1:
            deep_set = (used_numbers, sum(used_numbers))
        if skip_set[1] - deep_set[1] < 0:
            if skip_set[1] >= orig_target - max_diff:
                # print("Setting best subset to ", skip_set)
                best_subset = skip_set
            elif deep_set[1] >= orig_target - max_diff:
                # print("Setting best subset to ", deep_set)
                best_subset = deep_set
        elif deep_set[1] >= orig_target - max_diff:
            # print("Setting best subset to ", deep_set)
            best_subset = deep_set
        elif skip_set[1] >= orig_target - max_diff:
            # print("Setting best subset to ", skip_set)
            best_subset = skip_set
        # print("Recursive best subset: ", best_subset)
    # already_done[key] = best_subset
    # print("Final best subset: ", best_subset)
    return best_subset


def find_closest_smaller(numbers, target):
    '''
    Uses binary search to find the closest smaller or equal umber to the given
    one. Given list must be sorted!
    '''
    if len(numbers) == 0 or numbers[0] > target:
        return -1
    key = str(numbers) + ';' + str(target)
    if key in already_done2:
        return already_done2[key]
    done = False
    best_number = numbers[0]
    while not done:
        if len(numbers) == 0:
            break
        curr_index = int(len(numbers) / 2)
        if numbers[curr_index] > target:
            numbers = numbers[:curr_index]
        else:
            if target - numbers[curr_index] <= target - best_number:
                best_number = numbers[curr_index]
            numbers = numbers[curr_index+1:]
    already_done2[key] = best_number
    return best_number


def make_dictionary(cow_heights):
    '''Returns a dictionary made from the cow_heights list.'''
    dictionary = {}
    for c in cow_heights:
        if c not in dictionary:
            dictionary[c] = 0
        dictionary[c] += 1
    return dictionary


def small_problem_subset_sum(numbers, target_sum):
    num_of_subsets = small_problem_recursion(numbers, target_sum, len(numbers) - 1)
    print(num_of_subsets)


def small_problem_recursion(numbers, target_sum, current_index):
    '''
    My sub program for the simpler problem (subset that equals given sum).
    Any code related to this problem is in here.
    '''
    key = str(target_sum) + ';' + str(current_index)
    if key in already_done:
        # Current list in saved calculations; No need to do the same calculation again
        return already_done[key]
    elif target_sum == 0:
        # Working subset found: Return 1 to let the program know
        return 1
    elif current_index < 0:
        # Reached end of array: No subset found
        return 0
    elif target_sum < numbers[current_index]:
        # Number is greater than target_sum, so no point in recursing
        # further; skip the current number instead
        subsets = small_problem_recursion(numbers, target_sum, current_index - 1)
    else:
        # Continue recursing with the current number factored in; also try
        # skipping the number
        deep_set_num = small_problem_recursion(numbers, target_sum - numbers[current_index], current_index - 1)
        skip_set_num = small_problem_recursion(numbers, target_sum, current_index - 1)
        subsets = deep_set_num + skip_set_num
    already_done[key] = subsets
    return subsets


def main():
    '''
    This problem is the boss problem. Therefore, it needs to be special.
    So this one has a main function.
    Uhhhh yeah, that's really the only reason this is here.
    I have nothing better to say.
    Why did I even consider making this main thing again?
    '''
    # Input parsing
    for _ in range(int(input())):
        num_of_cows, shelf_height = map(int, input().split())
        cow_heights = []
        for cow_height in range(num_of_cows):
            cow_heights.append(int(input()))
        # Run the currently used method
        answer = solve_lazy(cow_heights, shelf_height)
        print(answer, flush=True)


def test_cases():
    '''Test cases.'''
    import time
    import random
    start_time = time.time()
    # Test cases: Edges
    '''solve_problem([27, 9, 3, 1, 3, 9, 27], 38)
    solve_problem([1, 1, 1, 23242342, 1, 1, 1], 7)
    solve_problem([8, 13, 28, 26, 24, 20, 17, 11, 9, 7], 2)
    solve_problem([3, 3, 5, 5, 7, 7, 9, 9, 9, 9], 6)
    solve_problem([51], 50)
    solve_problem([800000, 799999, 50000, 10000, 20000, 19800], 829572)'''
    solve_problem([299, 239, 116, 128], 416)
    # Test case: Time complexity
    num_loops = 0
    num_limit = 30
    for i in range(num_loops):
        long_list = [i for i in range(1, num_limit + 1) if random.random() > 0.9]
        shelf_height = int(sum(long_list) * (0.5 + random.random() / 2))
        print("Cows: ", repr(long_list))
        print("Shelf height: ", shelf_height)
        solve_problem(long_list, shelf_height)
        print("--------------")
    time_taken = round(time.time() - start_time, 4)
    print("Time taken: {} seconds".format(time_taken))


# The fancy thing to check if this file is being run directly
# I mean, it'll never be run indirectly but who cares
if __name__ == "__main__":
    '''
    import time
    import random
    # Test cases: Basic
    small_problem_subset_sum([1, 2, 3, 4, 5], 15)
    small_problem_subset_sum([1, 3, 5, 7, 9], 19)
    small_problem_subset_sum([6, 11, 14, 18, 22], 20)
    # Test cases: Edges / error prevention
    small_problem_subset_sum([], 0)
    small_problem_subset_sum([5], 5)
    small_problem_subset_sum([10, 11], 10)
    small_problem_subset_sum([9, 2, 7, 5, 11], 17)
    # Test case: Time complexity
    start_time = time.time()
    number_limit = 300
    num_list = [i for i in range(1, number_limit + 1)]
    target_sum = random.randint(0, int((1 + number_limit / 2) * number_limit))
    print("Target sum: ", target_sum)
    small_problem_subset_sum(num_list, target_sum)
    time_taken = round(time.time() - start_time, 4)
    print("Time taken: {} seconds".format(time_taken))
    '''
    # test_cases()
    main()
