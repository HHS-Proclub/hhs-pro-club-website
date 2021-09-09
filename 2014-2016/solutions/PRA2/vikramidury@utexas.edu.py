def set_diff(s1, s2):
    set = []
    for x in s1:
        if not(x in s2):
            set.append(x)
    return set

def intersection(s1, s2):
    set = []
    for x in s1:
        if x in s2:
            set.append(x)
    return set

def num_diff(shorter, longer):
    t = 0
    diff = 0
    for x in longer:
        if shorter[t] != x:
            diff += 1
        else:
            t += 1
    return diff + len(shorter) - t

s1 = input()
s2 = input()

i1 = intersection('coding', 'programming')
i2 = intersection('programming', 'coding')
longer = i1 if len(i1) > len(i2) else i2
shorter = i2 if longer == i1 else i1

print(num_diff(shorter, longer) + len(set_diff(s1,s2)) + len(set_diff(s2, s1)))
