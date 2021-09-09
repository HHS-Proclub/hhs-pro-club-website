years = int(input())
answers = []

def check_distinct(iterable):
    seen_items = []
    for i in iterable:
        if i in seen_items:
            return False
        else:
            seen_items.append(i)
    return True

for i in range(years):
    year = int(input())
    condition = False
    for j in range(year + 1, 9013):
        y = str(j)
        if check_distinct(y):
            answers.append(y)
            break

[print(a) for a in answers]
