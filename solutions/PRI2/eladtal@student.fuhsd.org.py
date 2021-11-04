amt = int(input())
values = []

for i in range(amt):
    values.append(input())
for s in values:
    count_ = 0
    i = len(s) - 1
    while i > 0:

        if s[i] == '0':
            count_ += 1
            i -= 1

        else:
            count_ += 1

            while s[i] == '1' and i > 0:
                count_ += 1
                i -= 1
            if i == 0:
                count_ += 1
            s = s[:i] + "1" + s[i + 1:]
    print(count_)
