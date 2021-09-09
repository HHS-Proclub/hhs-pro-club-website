s = input()
d = {}
for i in range(len(s)):
    if s[i] in d:
        d[s[i]] += 1
    else:
        d[s[i]] = 1
lst = []
for k in d:
    lst.append((k, d[k]))

lst = sorted(lst)
[print(x[0],x[1]) for x in lst]
