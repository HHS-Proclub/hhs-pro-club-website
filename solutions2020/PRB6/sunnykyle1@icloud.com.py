"""
This code is definitely not clean. But it works (albeit slowly), so yay.

By Giantpizzahead
PRB6: Shine the Spotlight
Going for a cleaner piece of code this time. Let's see how it goes.
"""


def find_good_positions(actor_rows):
    """
    Return the number of good positions for the spotlight.

    Needs a 2D array of actor rows (0 for no actor, 1 for actor).
    Outputs the answer as an integer.
    """
    good_position_num = 0
    # Check each actor
    for row_num, actor_row in enumerate(actor_rows):
        for actor_num, actor in enumerate(actor_row):
            if actor == 0:
                if 1 in actor_row[actor_num:]:
                    good_position_num += 1
                if 1 in actor_row[:actor_num]:
                    good_position_num += 1
                no_actors = True
                for row in actor_rows[row_num:]:
                    if row[actor_num] == 1:
                        no_actors = False
                        break
                if not no_actors:
                    good_position_num += 1
                no_actors = True
                for row in actor_rows[:row_num]:
                    if row[actor_num] == 1:
                        no_actors = False
                        break
                if not no_actors:
                    good_position_num += 1

    return good_position_num


# Input handling
for performance in range(int(input())):
    actor_rows = []
    for rows in range(int(input().split()[0])):
        actor_row = [int(i) for i in input().split()]
        actor_rows.append(actor_row)
    print(find_good_positions(actor_rows), flush=True)
