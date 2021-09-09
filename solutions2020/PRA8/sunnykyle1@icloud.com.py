'''
PRA8: Keys
By Giantpizzahead

No comment. Let's go!
'''


def attempt_3(people, keys, officer):
    '''
    Attempt 3.
    I've thought it out this time... I think.
    '''
    pass



def attempt_2(people, keys, officer):
    '''
    Attempt 2.
    Plan - For each key, find the distance that each person would have to travel to get
    that key and go to the office, and then find the minimum time for each key.
    Result - I got lost. Let's try this from the beginning...
    '''
    key_distance = []
    max_distance = []
    # Find the distance that each person would have to travel for each key
    for index, key in enumerate(keys):
        temp_all_dist = []
        temp_dist = abs(officer - key)
        for person in people:
            temp_all_dist.append(temp_dist + abs(person - key))
        temp_all_dist = sorted(temp_all_dist)
        key_distance.append(temp_all_dist)
        max_distance.append((index, temp_all_dist[-1]))
    # Find minimum time for each key (go in order of least max distance)
    min_time = []
    max_distance = sorted(max_distance, key=lambda x: x[1])
    for max_dist_tuple in max_distance[::-1]:
        if len(key_distance[0]) == 0:
            break
        curr_index = max_dist_tuple[0]
        print("curr_index = ", curr_index)
        print("Key distance: {}".format(key_distance))
        print("Adding time of {}".format(key_distance[curr_index][0]))
        min_time.append(key_distance[curr_index][0])
        for temp in key_distance:
            temp.pop(0)
    # Find maximum time in minimum times
    max_time = max(min_time)
    return max_time


def attempt_1(people, keys, officer):
    '''
    Attempt 1.
    Plan - Find the distance from each person to the officer.
    Evaluate the people in order from closest to furthest from the officer.
    Check if there is a key on route, if so, use the closest one to the officer.
    Else, get the key with the least extra travel distance (could be on opposite side
    or past officer!).
    Result - Ok, how about we do it a different way? For each key, calculate the distance
    that each person would have to travel to get that key and go to the office, and then
    find the maximum time or minimum time in that list. Something like that.
    '''
    # Make a list of the distance from each person to the officer
    # Each item is a tuple: (Index, Distance)
    people_diff = []
    for index, person in enumerate(people):
        people_diff.append((index, officer - person))
    people_diff = sorted(people_diff, key=lambda x: abs(x[1]))

    # Make a list of the distance from each key to the officer
    # Each item is a tuple: (Index, Distance)
    keys_diff = []
    for index, k in enumerate(keys):
        keys_diff.append((index, officer - k))
    keys_diff = sorted(keys_diff, key=lambda x: abs(x[1]))

    max_time = 0

    # Evaluate each person in correct order
    for person_diff in people_diff[::-1]:
        curr_index, curr_distance = person_diff
        curr_location = people[curr_index]

        # Look for the closest key on route
        closest_key = 0
        closest_key_diff = 999999999999999
        closest_distance = 999999999999999
        dist_from_person = 999999999999999
        for key in keys_diff:
            ck_index = key[0]
            key_distance = abs(curr_location - keys[ck_index])
            if key_distance + abs(key[1]) <= abs(curr_location - officer):
                # Key is on route / no detour needed, remember it if closest to person
                if closest_distance != 0 or key_distance <= dist_from_person:
                    closest_key = ck_index
                    closest_key_diff = key
                    closest_distance = 0
                    dist_from_person = key_distance
            elif abs(key[1]) > key_distance and key_distance <= closest_distance:
                closest_key = ck_index
                closest_key_diff = key
                closest_distance = key_distance
                dist_from_person = key_distance
                # Key is not on route, remember it if best distance so far
            elif key_distance > abs(key[1]) and abs(key[1]) <= closest_distance:
                closest_key = ck_index
                closest_key_diff = key
                closest_distance = abs(key[1])
                dist_from_person = key_distance
        # Now that we have the best key to get, remove this key, and calculate the time
        # it takes for the person to get the key / get to the office
        time_taken = abs(curr_distance) + (closest_distance * 2)
        keys_diff.remove(closest_key_diff)
        '''print("Key {} removed!".format(keys[closest_key]))
        print(curr_distance, closest_distance)
        print("Time taken for person at {} is {} seconds".format(curr_location, time_taken))
        print("Keys diff: {}".format(keys_diff))'''
        if time_taken > max_time:
            max_time = time_taken

    return max_time


# Input parsing
for _ in range(int(input())):
    _, _, officer_loc = map(int, input().split())
    people = list(map(int, input().split()))
    keys = list(map(int, input().split()))
    print(attempt_1(people, keys, officer_loc), flush=True)
