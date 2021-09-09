def split(string):
    string = str(string)
    s = []
    for ch in string:
        if len(s) == 0:
            s.append(ch)
        elif s[-1][0] == ch:
            s[-1] += ch
        else:
            s.append(ch)
    return s

def next_looksay(num):
    splitted = split(num)
    return ''.join([str(len(s)) + s[0] for s in splitted])[::-1]

def looksay(n):
    n = int(n)
    look = 1
    for i in range(n - 1):
        look = next_looksay(look)
    return look

print(looksay(input()))
